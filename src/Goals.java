public class Goals {
    public String prompt;
    public boolean goal_state = false;
    private static int goalcount = 0;

    public Goals (String m_prompt) {
        setGoal(m_prompt);
        goalcount++;
    }

    public void setGoal(String m_prompt) {
        this.prompt = m_prompt;
    }

    public void setState(boolean m_state) {
        this.goal_state = m_state;
    }

    public String getState() {
        if( this.goal_state) {
            return "DONE";
        }
        else
            return "NOT DONE";
    }


    public String getString () {
        return prompt;
    }

}



