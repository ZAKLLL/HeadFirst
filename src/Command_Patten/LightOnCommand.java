package Command_Patten;

/**
 * @program: HeadFirst_DesignPattern
 * @description: 遥控器开启命令
 * @author: ZakL
 * @create: 2019-10-04 15:12
 **/
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
        System.out.println(this.light.getClass().getName()+"开灯成功");
    }

    @Override
    public void undo() {
        light.off();
        System.out.println(this.light.getClass().getName() + "撤销成功");
    }

    @Override
    public Light getLight() {
        return light;
    }
}
