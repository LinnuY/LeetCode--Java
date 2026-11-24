package space.linuy.leetcode.bank;

import java.util.ArrayList;
import java.util.List;

public class LC3331 {


}

class Tree {
    private char c;
    private List<Tree> children;

    public Tree(List<Tree> children, char c) {
        this.children = children;
        this.c = c;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public List<Tree> getChildren() {
        return children;
    }

    public void setChildren(List<Tree> children) {
        this.children = children;
    }
}
