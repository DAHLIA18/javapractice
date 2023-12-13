public class AutoPolicy {
    private int policyNumber;
    private String makeAndModel;
    private String state;

    public AutoPolicy(int policyNumber, String makeAndModel, String state) {
        this.policyNumber = policyNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    public void setState(String state) {
     
        if (state.equals("CT") || state.equals("MA") || state.equals("ME") ||
            state.equals("NH") || state.equals("NJ") || state.equals("NY") ||
            state.equals("PA") || state.equals("VT")) {
            this.state = state;
        } else {
            System.out.println("Invalid state code for northeast states.");
        }
    }

    public String getState() {
        return state;
    }
}
