package praktek3;

public class laptop extends komputer {
    private String warnalaptop;
    
    void throttle(){
        System.out.println("laptop pang..");
    }

    public String getWarnalaptop() {
        return warnalaptop;
    }

    public void setWarnalaptop(String warnalaptop) {
        this.warnalaptop = warnalaptop;
    }

    
}
