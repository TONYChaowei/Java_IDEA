/**
 * 
 */
package Advanced;

/**
 * ��Ϸ�е���Ϸ��
 * @author Tony
 * @version 1.0
 * @data 2022��5��8������9:55:42
 * @conpyright The GeekTeam
 * @description
 * ��ҵ������ٴ���֮�����޸�
 * ������1-999֮��
 * ���ÿ����������ľ��鹫ʽ
 * �����ȼ� - 1��
 */
public class Hero {
	private long id;
	private String name;
	private int level;
	private long currExp;     //��ǰ�ľ���ֵ
	private long exp;		  //��ǰ������������ľ���ֵ - �̶�ֵ
	
	public Hero() {
		super();
		// TODO �Զ����ɵĹ��캯�����
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
			this.level = 1; //��������ޣ��ʹ�һ����ʼ
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
