/**
 * 
 */
package Advanced;

/**
 * 游戏中的游戏类
 * @author Tony
 * @version 1.0
 * @data 2022年5月8日上午9:55:42
 * @conpyright The GeekTeam
 * @description
 * 玩家的名称再创建之后不能修改
 * 级别在1-999之间
 * 玩家每级升级所需的经验公式
 * （（等级 - 1）
 */
public class Hero {
	private long id;
	private String name;
	private int level;
	private long currExp;     //当前的经验值
	private long exp;		  //当前级别升级所需的经验值 - 固定值
	
	public Hero() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public Hero(String name) {
		this.name = name;
	}

	public Hero(long id, String name, int level, long exp) {
		//super();
		this.id = id;
		this.name = name;
		this.level = level;
		this.exp = exp;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}


	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		if (level < 1 || level > 999) {  
			this.level = 1; //如果级别超限，就从一级开始
		}else {
			this.level = level;
		}
	}
	public long getCurrExp() {
		return currExp;
	}
	
	public void setCurrExp(long currExp) {
		this.currExp = currExp;
	}
}
