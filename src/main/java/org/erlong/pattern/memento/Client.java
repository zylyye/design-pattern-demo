package org.erlong.pattern.memento;

public class Client {

    public static void main(String[] args) {
        // 原始对象，拥有内部状态
        Originator originator = new Originator();
        // 备忘录存储仓
        CareTaker careTaker = new CareTaker();
        originator.setState("a");
        // 保存原始对象的快照，方便以后恢复
        careTaker.saveState(originator.createSnapshot());
        originator.showState();
        originator.setState("b");
        originator.showState();
        // 恢复快照
        originator.restoreFromSnapshot(careTaker.retrieveState());
        originator.showState();
    }

}
