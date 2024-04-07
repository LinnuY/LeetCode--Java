package space.linuy.leetcode;


import java.util.ArrayList;
import java.util.List;

public class ThroneInheritance {

    private static class Tree {
        public String name;
        public boolean isAlive;
        public List<Tree> children;

        public Tree(String name) {
            this.name = name;
            this.isAlive = true;
            this.children = new ArrayList<>();
        }
    }

    private final Tree tree;

    private Tree findTreeCodeByName(String name) {
        return dfsFind(name, tree);
    }

    private Tree dfsFind(String name, Tree code) {
        if (code.name.equals(name)) {
            return code;
        }
        Tree result;
        for (Tree child : code.children) {
            result = dfsFind(name, child);
            if (result != null) return result;
        }
        return null;
    }

    public ThroneInheritance(String kingName) {
        tree = new Tree(kingName);
    }

    public void birth(String parentName, String childName) {
        Tree parent = findTreeCodeByName(parentName);
        if (parent == null) return;
        Tree child = new Tree(childName);
        parent.children.add(child);
    }

    public void death(String name) {
        Tree result = findTreeCodeByName(name);
        if (result == null) return;
        result.isAlive = false;
    }

    public List<String> getInheritanceOrder() {
        List<String> result = new ArrayList<>();
        dfsOrder(result, tree);
        return result;
    }

    private void dfsOrder(List<String> result, Tree tree) {
        if (tree.isAlive) {
            result.add(tree.name);
        }
        for (Tree child : tree.children) {
            dfsOrder(result, child);
        }
    }
}
