import java.io.IOException;
/*
*一个用于处理linux命令输入，返回命令输出的类
*
*/
public class Processor
{
	/*命令运行实例*/
	public static Runtime runtime;

	public static Runtime getRuntime() {
		
		if(runtime == null)
		{
			return runtime = Runtime.getRuntime();	
		}
		else
		{
			return runtime;
		}
	}
	public static Process executeCMD(String cmd) {
		Process ps = null;
		String[] cmds = {"/bin/bash","-c", cmd };
		try {
			ps = getRuntime().exec(cmds);
		} catch (IOException e)
		{
			System.out.println("Process running error");
		}
		return ps;
	}
}
