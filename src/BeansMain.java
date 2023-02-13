import beans.DataInfors;
import beans.MemberBean;

public class BeansMain {
    public static void main(String[] args) {
        DataInfors dataInfors = new DataInfors();
        MemberBean memberBean = dataInfors.getDataToMemberBean();

        System.out.println(memberBean.getFirstName() + memberBean.getsecondName() + memberBean.getHandleName());
    }
}
