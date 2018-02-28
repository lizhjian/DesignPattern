package com.mediator;

/**
 * 中介者模式
 * 市场部调用outAction
 *outAction里面调用 中介者的实现中的方法 中介者保留了 金融部的行为  金融部初始化的时候到中介者中注册过了
 * 也就是三个部门都到中介报道了  A通过方法调用中介，中介再找B
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new President();
        Market market = new Market(mediator);
        Development development = new Development(mediator);
        Finacial finacial = new Finacial(mediator);

        market.selfAction();

        market.outAction();
    }
}
