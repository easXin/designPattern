package cn.bugstack.design;

/**
 * 开发过程中  高层 不应该 依赖 于底层 模块， 两个都 应该 依赖于 抽象
 *
 * 抽象 不应该 依赖 于 细节，实现的类
 */
public class BetUser {

    private String userName;  // 用户姓名
    private int userWeight;   // 用户权重

    public BetUser() {
    }

    public BetUser(String userName, int userWeight) {
        this.userName = userName;
        this.userWeight = userWeight;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserWeight() {
        return userWeight;
    }

    public void setUserWeight(int userWeight) {
        this.userWeight = userWeight;
    }
}
