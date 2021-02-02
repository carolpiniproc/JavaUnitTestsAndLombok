package chronos.logica;

public class HelloWorld {
    private String hello;
    private Integer num; //Integer recebe valor null, mas int não, o default é 0

    public HelloWorld(){}

    public HelloWorld(String hello) {
        this.hello = hello;
    }

    public HelloWorld(String hello, Integer num) {
        this.hello = hello;
        this.num = num;
    }

    public String getHello(){
        return hello;
    }

    public void setHello(String _hello){
        this.hello = _hello;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }


}
