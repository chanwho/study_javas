package beans;

public class DataInfors {
    public MemberBean getDataToMemberBean(){
        MemberBean memberBean = new MemberBean();
        memberBean.setfirstName("Mark");
        memberBean.setsecondName("Otto");
        memberBean.setHandleName("@mdo");
        return memberBean;
    }
}
