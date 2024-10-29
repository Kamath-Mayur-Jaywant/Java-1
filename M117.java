class Outer{
    void display(){
        System.out.println("Outer class display method");}
    class   Inner{
        void display(){
        System.out.println("Inner class display method");
    }
    }}
    
class M117 {
    public static void main(String[] args){
        String title0="Lab program 8-Nested Class";
        String title1="Develop a Java program to create an  outer class with a function display";
        String title2="Create another class inside outer class named inner class with a function display";
        String title3="Call two functions in main class";
        String title4="Print the optput";
        System.out.println(title0+"\n"+title1+"\n"+title2+"\n"+title3+"\n"+title4);
		Outer o1=new Outer();
		o1.display();
		Outer.Inner i1=o1.new Inner();    // object is of type Outer.Inner
		i1.display();}}
    
