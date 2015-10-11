public class Dic
{
   private String word;
   private String mean;
   private Dic first,last;
      int size = 0;

   
   public Dic()
   {
      word = "null";
      mean = "null";
   }
   public Dic(String word,String mean)
   {
      word = word;
      mean = mean;
   }

   public String getword()
   {
      return word;
   }
   public String getmean()
   {
      return mean;
   }
   public void setword(String addword)
   {
      addword = word;
   }
   public void setmean(String addmean)
   {
      addmean = mean;
   }
   public void add(String word,String mean)
   {
      Dic newdic = new Dic(word,mean);
      newdic.next = first;
      first = newdic;
      size++;
   
   }
}