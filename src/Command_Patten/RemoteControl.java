package Command_Patten;

/**
 * @program: HeadFirst_DesignPattern
 * @description: 模拟远程遥控器
 * @author: ZakL
 * @create: 2019-10-04 15:20
 **/
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7]; //设置遥控器共有7个开灯按钮对应七个灯
        offCommands = new Command[7]; //设置遥控器共有7个关灯按钮对应七个灯
        Command noCommand = new NoCommand();

        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommands(int onIndex, Command onCommand, int offIndex, Command offCommand) {
        if (onIndex >= onCommands.length || offIndex >= offCommands.length) {
            System.out.println("设置功能按键失败,请设置在正确的功能插槽中");
            return;
        } else if (!(onCommands[onIndex] instanceof NoCommand) || !(offCommands[offIndex] instanceof NoCommand)) {//如果要设置的插槽已经有功能键则拒绝插入
            System.out.println("当前插槽已经有功能键存在,请重试");
            return;
        } else if (offIndex != onIndex) {
            System.out.println("请将开关功能成对插入");
            return;
        } else if (onCommand.getLight() == offCommand.getLight()) {
            System.out.println("请插入同一个灯泡的开关功能");
            return;
        }
        onCommands[onIndex] = onCommand;
        offCommands[offIndex] = offCommand;
    }

    public void onButtonPushed(int onIndex) {
        onCommands[onIndex].execute();
        undoCommand = onCommands[onIndex];
    }

    public void offButtonPush(int offIndex) {
        offCommands[offIndex].execute();
        undoCommand = offCommands[offIndex];
    }

    public void getCommandInfo() {
        for (int i = 0; i < offCommands.length; i++) {
            if (!(offCommands[i] instanceof NoCommand)) {
                System.out.println("第" + i + "对功能按钮为" + onCommands[i].getClass().getName() + ":" + offCommands[i].getClass().getName());
            } else {
                System.out. format("第%d对功能键可以插入\n", i);
            }
        }
    }

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.getCommandInfo();
    }
}
