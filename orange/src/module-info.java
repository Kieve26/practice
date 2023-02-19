
public class Orange {
String color;
Orange(String color)
{
this.color=color;
}
public static void main(String[] args) {
// TODO Auto-generated method stub
Orange greenApple = new Orange(&quot;green&quot;);
String color = greenApple.getColor();
System.out.println(&quot;color of apple is &quot; + color);

}
}
Push the project into github
Create a branch X and add the following code in the constructor:
String getColor()
{
return color;
}