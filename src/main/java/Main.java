class Main {
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
  public static Queue<Integer> קס1_copyQueue(Queue<Integer> q)
    {
        Queue<Integer> copy=new Queue<>();
        Queue<Integer> temp=new Queue<>();
        while(!q.isEmpty())
        {
            int x=q.remove();
            copy.insert(x);
            temp.insert(x);
        }
        while(!temp.isEmpty())
            q.insert(temp.remove());
        return copy;
    }
    public static double ex2_averageQueue(Queue<Integer> q)
    {
        Queue<Integer> copy=copyQueue(q);
        int sum=0;
        int count=0;
        while(!copy.isEmpty())
        {
            sum+=copy.remove();
            count++;
        }
        return(double)sum/count;
    }
    public static int ex3_countDividers(Queue<Integer> q,int num)
    {
        Queue<Integer> copy=copyQueue(q);
        int count=0;
        while(copy.isEmpty()==false)
        {
            int x=copy.remove();
            if(num%x==0)
                count++;
        }
        return count;
    }
    public static boolean ex4_allDivide(Queue<Integer> q1,Queue<Integer> q2)
    {
        Queue<Integer> c1=copyQueue(q1);
        Queue<Integer> c2=copyQueue(q2);
        while(!c1.isEmpty())
        {
            int x=c1.remove();
            boolean found=false;
            Queue<Integer> temp=copyQueue(c2);
            while(!temp.isEmpty())
            {
                if(temp.remove()%x==0)
                    found=true;
            }
            if(!found)
                return false;
        }
        return true;
    }
    public static boolean ex5_appearsInSequence(Queue<Integer> q,int num)
    {
        Queue<Integer> copy=copyQueue(q);
        int count=0;
        while(!copy.isEmpty())
        {
            int x=copy.remove();
            if(x==num)
            {
                count++;
                if(count>1)
                    return true;
            }else
                count=0;
        }
        return false;
    }
}
