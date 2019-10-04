package Command_Patten;

/**
 * @program: HeadFirst_DesignPattern
 * @description: 模拟提供没有功能的命令按键
 * @author: ZakL
 * @create: 2019-10-04 15:17
 **/
public class NoCommand  implements Command{
    @Override
    public void undo() {
        //do Nothing
    }

    @Override
    public void execute() {

    }
}
