package Command_Patten;

/**
 * @program: HeadFirst_DesignPattern
 * @description: 命令接口
 * @author: ZakL
 * @create: 2019-10-04 15:11
 **/
public interface Command {
    void execute();//执行命令

    void undo(); //撤销命令

    Light getLight();
}
