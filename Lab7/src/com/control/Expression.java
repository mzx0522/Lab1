

public class In_expression {
	private StringBuffer in_a;
	public void in() {
	Scanner input=new Scanner(System.in);
		StringBuffer a=new StringBuffer();
		a.append(input.nextLine());
		in_a=a
		return a;
	}
	
	public void put() {
		return in_a;
	}
}//输入表达式界面


public class Out_result {
	private StringBuffer out_a;
	public void out() {
	System.out.println(out_a);
	}
	
	public void put(StringBuffer a) {
		out_a=a
	}
}//输出表达式界面


public class Expressioncontrol {
	public StringBuffer exm;
	public StringBuffer a;
	public int charge() {
	if((exm.indexOf("!simplify")==-1)&&(exm.indexOf("!d/d")==-1)){
					return 1;	
			}
		
			
		else if((exm.indexOf("!simplify")!=-1)&&(exm.indexOf("!d/d")==-1)){				
					return 2;
			}
			
		else if((exm.indexOf("!simplify")==-1)&&(exm.indexOf("!d/d")!=-1)){ 				
							
					return 3;	
			}
	}
	
	public void set_a(StringBuffer b) {
		b=a;
		a=exm;
	}
}//表达式控制类


public class Expression {
	private StringBuffer m;
	private StringBuffer n;
	public void In_m(StringBuffer a) {
		m=a;
	}
	
	public void In_n(StringBuffer b) {
		n=b;
	}
	
	public String Der() {
							String o=new String();
							String fstr[]=new String[10];
							int q1=0;
							StringBuffer w=new StringBuffer();
							StringBuffer wout=new StringBuffer();
							o=m.toString();
							
					for(int i=0;i<=o.length();i++)
					{		
						if(i==o.length()){
							fstr[q1]=w.toString();
							w.setLength(0);
							q1++;
						}
						else if(o.toCharArray()[i]!='+')
						{
							w.append(o.toCharArray()[i]);
						}
						else
						{	
							fstr[q1]=w.toString();
							w.setLength(0);
							q1++;
						}
					}
					
					boolean flag=false;
					for(int j=0;j<q1;j++)
					{		
							int q2=0;
					
							for(int d=0;d<fstr[j].length();d++)
							{	
								if(fstr[j].toCharArray()[d]==n.toString().toCharArray()[4])
								{
									q2++;
								}
							}
							if(q2>0)
							{
								flag=true;
								for(int d=0;d<fstr[j].length();d++)
								{	
									if(fstr[j].toCharArray()[d]==n.toString().toCharArray()[4])
									{
										
													String s = (new Integer(q2)).toString();

										            for(int k=0;k<fstr[j].length();k++)
										            {
										            	if(k!=d){
										            	wout.append(fstr[j].toCharArray()[k]);
										            	}
										            	else{
										            		wout.append(s);
										            	}
										            }
										            
										            wout.append("+");
										            break;
										            
									}
								}
							}
							
					}
					if(!flag)
					{
						return "error,no variable!";
					}
					return wout.deleteCharAt(wout.length()-1).toString();
							
			
			}

	}
	
	
	public String Sim() {
				String w=new String();
				w=m.toString().replace(m.toString().toCharArray()[10],
				str.toString().toCharArray()[12]);
							return w;
				
	}
}//表达式实体类
