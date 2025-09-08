class schooldetails{
     static String schoolname="";
    String studentname="";
     void record(){
        System.out.println("the studentname is:"+studentname+ "  the school name is:"+schoolname);
    }
}

public class School {
    public static void main(String[] args) {
        schooldetails s1=new schooldetails();
        s1.studentname="bharath";
        schooldetails s2=new schooldetails();
        s2.studentname="praveen";

        schooldetails.schoolname="velammal";
        schooldetails.schoolname="donbosco";
        s1.record();
        s2.record();
    }
}
