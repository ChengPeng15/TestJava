abstract class Parent1{
    abstract void grow();
}
class Son1 extends Parent1{
    void grow(){
        System.out.println("�ұȸ��׳ɳ�������һ�㣺Son1");
    }
    void play(){
        System.out.println("�һ�����");
    }
}
class Daughter extends Parent1{
    void grow(){
        System.out.println("�ұȸ��׳ɳ������úܶ�:daughter");
    }
    void dance(){
        System.out.println("�һ�����");
    }
}
public class test2 {
    public static void main(String[] args) {
        Parent1 p=new Son1();
        show(p);
        Parent1 p2=new Daughter();
        show(p2);
    }
    public static void show(Parent1 p){
            //�ֽ��������еķ������
            p.grow();
            //�Խ��й���ת�͵Ķ�����������жϣ�Ȼ�������Ӧ��ǿ����ת��
            if(p instanceof Son1){
                //�ж����ĸ������ת�Ͷ���Ȼ�������ת��
                Son1 s=(Son1)p;
                //���������еķ���
                s.play();
            }else if(p instanceof Daughter){
                Daughter d=(Daughter)p;
                d.dance();
            }
            
    }
}