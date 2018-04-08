package praktek3;

public class laptop extends komputer {
    private String merklaptop;
    
    void throttle(){
        System.out.println("laptop pang..");
    }

    public String getMerklaptop() {
        return merklaptop;
    }

    public void setMerklaptop(String merklaptop) {
        this.merklaptop = merklaptop;
    }
    
    
}
