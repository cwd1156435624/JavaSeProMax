package d3_abstract.demo2;

public abstract class Template {
    private void begin(){
        System.out.println("这是作文的开头");
    }

    public abstract void body();

    private void end(){
        System.out.println("这是作文的结尾");
    }

    public final void write(){
        begin();
        body();
        end();
    }
}
