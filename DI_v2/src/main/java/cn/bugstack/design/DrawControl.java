package cn.bugstack.design;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class DrawControl {

    private IDraw draw;

    public List<BetUser> doDraw(IDraw draw, List<BetUser> betUserList, int count) {
        return draw.prize(betUserList, count);
    }

}
