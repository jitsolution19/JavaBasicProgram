/**A  multithreaded  program  contains  two  or  more  parts  that  can  run  concurrently  and  each  part  can  handle 
different  task  at  the  same  time  making  optimal  use  of  the  available  resources  specially  when  your  computer  has 
multiple CPUs. 
By  definition  multitasking  is  when  multiple  processes  share  common  processing  resources  such  as  a  CPU. 
Multithreading extends the idea of multitasking into applications where you can subdivide specific operations within 
a single application into individual threads. Each of the threads can run in parallel. The OS divides processing time 
not only among different applications, but also among each thread within an application. **/
package multithreading;
	public class TestThread { 
	   public static void main(String args[]) { 
	    
	      RunnableDemo R1 = new RunnableDemo( "Thread-1"); 
	      R1.start(); 
	       
	      RunnableDemo R2 = new RunnableDemo( "Thread-2"); 
	      R2.start(); 
	   }   
}
