import java.util.Scanner;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
 class multiply implements ActionListener
{
    
    String s[]=new String[1000];
    String df[]=new String[1000];
     String dfg[]=new String[1000];
      String dfh[]=new String[1000];
        String dfhh[]=new String[1000];
    String s1="";String s4="";
    
    
    int countt=0;
   
    
    
    JFrame f;
    JTextField tf1,tf2,tf34,tf4;
    JButton b,b1,b2,b3,b4;
    int ccc=0;
    GridLayout g1=new GridLayout(12,1,5,5);
    JPanel jp=new JPanel();
    JPanel jp1=new JPanel();
    JLabel l1,l2,l3,l4;
    
    multiply()
    {
        f=new JFrame("MULTIPLICATION");
        Scanner t1=new Scanner(System.in);
        l1=new JLabel("ENTER ONE NUMBER:");
         l1.setBounds(0,0,300,30);
         l1.setForeground(Color.BLUE);
          jp.add(l1);
           
        tf1=new JTextField();
       tf1.setBounds(0,10,300,30);
        jp.add(tf1);
       
        //System.out.println("ENTER ONE NUMBER");
         l2=new JLabel("ENTER SECOND NUMBER:");
         l2.setBounds(0,50,300,30);
         l2.setForeground(Color.RED);//(Color.YELLOW);
          jp.add(l2);
          
         tf2=new JTextField();
          tf2.setBounds(0,70,300,30);
         jp.add(tf2);
          b=new JButton("MULITPLY");
          b.setBounds(50,120,200,30);
          b.addActionListener(this);
          
        jp.add(b);
         b3=new JButton("ADD");
          b3.setBounds(50,120,200,30);
          b3.addActionListener(this);
          
        jp.add(b3);
         
         
        tf34=new JTextField();
         tf34.setBounds(0,150,300,60); 
         tf34.setBackground(Color.yellow);
         
         JScrollPane sd1=new JScrollPane(tf34);
          b1=new JButton("RESET");
          b1.setBounds(50,180,200,30);
          b1.addActionListener(this);
          l3=new JLabel("OUTPUT:");
         l3.setBounds(0,210,500,30);
         l3.setForeground(Color.GREEN);//(Color.YELLOW);
          l4=new JLabel("CHECK HISTORY");
         l4.setBounds(0,210,300,30);
         l4.setForeground(Color.PINK);
          b2=new JButton("HISTORY");
          b2.setSize(200,30);
          b2.addActionListener(this);
           tf4=new JTextField();
         tf4.setBounds(0,470,300,90); 
         tf4.setBackground(Color.orange);
        jp.add(b1);
        jp.add(l3);
        jp.add(sd1);
        jp.add(l4);
        jp.add(b2);
        JScrollPane sd=new JScrollPane(tf4);
         jp.add(sd);
        jp.setLayout(g1);
        
        jp.setSize(500,700);
        jp.setBackground(Color.GRAY);
        f.add(jp);
     
        f.setSize(500,700);
        f.setVisible(true);
        
      
    }
   
   public void mywork1()
   {String s2="";
       int u;String rr="";
    int uu=0;int count11=0;
         int c;int gh;int d;
        //FIRST ARRAY
       for(int j=0;j<s4.length();j++)
       {
           String s0="";
           s0=s0+s4.charAt(s4.length()-j-1);
           d=Integer.parseInt(s0);
              int r=0;
              //SECOND ARRAY
        for(int i=0;i<s1.length();i++)
        {
            String s5="";
            
            s5=s5+s1.charAt(s1.length()-i-1);
             c=Integer.parseInt(s5);
              c=c*d;
            //LAST OF ARRAY we have not to divide by 10 
             if(i==(s1.length()-1))
              {
                  gh=c+r;
                  //r=carry of multiply
               }
              else
              {
              gh=c%10;
              gh=gh+r;
              
               r=c/10;
              }
            
             String s6=String.valueOf(gh);
           s2=s2+s6; 
          }
       
       String s6="";
       int count=1;
       int m=s2.length();
       //REVERSE OF ALL STRING ONE BY ONE
       for(int k=s2.length()-1;k>=0;k--)
             {
                  if((m==(s1.length()+1))&&(k==(s2.length()-1)||k==(s2.length()-2)))
                  {
                      
                      s6=s6+s2.charAt(k-count);
                      
                      count=count-2;
                  }
                  else
                  {
                 s6=s6+s2.charAt(k);
                  }
                 
             }
             s2="";
             s[j]=s2+s6;
              count11++;
       }
       String dd="0";
       
      //ADDING ZERO AND END OF STRING TO SHIFT STRING INPLACE OF 'X' in multiply 
       for(int p=0;p<count11;p++)
       {
           for(int l=0;l<p;l++)
           {
            s[p]=s[p]+dd;
            
           }
       // System.out.println(s[p]);
      //   System.out.println(s[p].charAt(s[p].length()-1));
       }
      // System.out.println(s[count11-1].length());
       int count22=0;
      
       
   // FINAL ADDITION OF OUTPUT  
     for(int pl=s[count11-1].length()-1;pl>=0;pl--)//LENGTH OF FINAL OUTPUT ..
     {
       int sum=0;
         
         for(int p2=0;p2<count11;p2++)
         {
             //CHECK WHETHER LENGTH OF STRING IS NOT GREATER THAN LENGTH OF MULTIPLY 
             if(s[p2].length()>count22)
             {
                // System.out.println(s[p2].charAt(count22));
                 String ss="";
             ss=ss+s[p2].charAt(s[p2].length()-1-count22);
            sum+=Integer.parseInt(ss); 
          
             }
            
         }
       //   System.out.println("SUM"+sum);
           sum=sum+uu;
             u=sum%10;
            uu=sum/10;
         String de=String.valueOf(u);
         rr=rr+de;
         count22++;
     }
   String jk="";
       //System.out.println(rr);
     //REVERSE FINAL OUTPUT
     for(int kkk=count22-1;kkk>=0;kkk--)
     {
         jk=jk+rr.charAt(kkk);
     }
     df[countt]=jk;
     dfg[countt]=s1;
     String s55="*";
     dfhh[countt]=s55;
     dfh[countt]=s4;
     countt++;
   //  System.out.println(jk);
     tf34.setText(jk);
   }
   public void mywork2()
   {int c1;
   int d1;
  // System.out.println(s1);
    //System.out.println(s4);
  String hh="";
   String rr="",mm="";
   int r=0;int m=0;
       if(s1.length()>s4.length())
       {
         c1=s1.length();
         d1=s4.length();
         rr=s1;
         mm=s4;
       }
       else if(s1.length()<s4.length())
       {
           d1=s1.length();
         c1=s4.length();
         rr=s4;
         mm=s1;
       }
       else
       {
           c1=d1=s1.length();rr=s4;
         mm=s1;
           
       }
       int count=d1-1;
       for(int i=c1-1;i>=0;i--)
       {
           if(count>=0)
           {
           String ss="";
           ss=ss+mm.charAt(count);
           int t=Integer.parseInt(ss);
          // System.out.println(t);
           ss="";
           ss=ss+rr.charAt(i);
           int s=Integer.parseInt(ss);
           System.out.println(s);
           r=t+s+m;
           m=r/10;
           r=r%10;
           hh=hh+String.valueOf(r);
           //System.out.println(hh);
           count--;
           }
           else
           {
               String ss="";
               ss=ss+rr.charAt(i);
               int t=Integer.parseInt(ss);
               r=t+m;
               m=0;
               hh=hh+String.valueOf(r);
             //    System.out.println(hh);
           }
           }
       String s6="";
      int count1=1;
       int m1=hh.length();
       //REVERSE OF ALL STRING ONE BY ONE
       for(int k=hh.length()-1;k>=0;k--)
             {
                  if((m1==(c1+1))&&(k==(hh.length()-1)||k==(hh.length()-2)))
                  {
                      
                      s6=s6+hh.charAt(k-count1);
                      
                      count1=count1-2;
                  }
                  else
                  {
                 s6=s6+hh.charAt(k);
                  }
                 
             }
       hh=s6;
       
              df[countt]=hh;
     dfg[countt]=s1;
     dfh[countt]=s4;
     String s55="+";
     dfhh[countt]=s55;
     countt++;
   //  System.out.println(jk);
     tf34.setText(hh);
       
   }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b)//MULITPLY
        {
            if(s1==""&&s4=="")
            {
         s1=s1+tf1.getText();
         s4=s4+tf2.getText();
            }
            else
            {
               s1=tf1.getText();
         s4=tf2.getText(); 
            }
         if(s1.length()==0)
         {
             tf1.setText("ENTER PLZ");
         }
         else if(s4.length()==0)
         {
             tf2.setText("ENTER PLZ");
         }
         else
         {
             tf34.setText("");
          mywork1();
         }
        
        }
        if(e.getSource()==b3)//ADD
        {
             if(s1==""&&s4=="")
            {
         s1=s1+tf1.getText();
         s4=s4+tf2.getText();
            }
            else
            {
               s1=tf1.getText();
         s4=tf2.getText(); 
            }
         if(s1.length()==0)
         {
             tf1.setText("ENTER PLZ");
         }
         else if(s4.length()==0)
         {
             tf2.setText("ENTER PLZ");
         }
         else
         {
             
             tf34.setText("");
          mywork2();
         }
        }
        if(e.getSource()==b1)
        {
            tf1.setText("");tf2.setText("");tf34.setText("");
             s1="";s4="";
   

   tf4.setText("");
        }
        if(e.getSource()==b2)
        {String gh1="";
            for(int i=0;i<countt;i++)
            {
                
                gh1=gh1+String.valueOf(i+1)+")"+dfg[i]+" "+dfhh[i]+" "+dfh[i]+" = "+df[i]+"\t";
                
            
            }
            tf4.setText(gh1);
        }
    }
    public static void main(String... s3)
    {
        new multiply();
    }

   
    
}
