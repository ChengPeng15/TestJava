abstract class Parent{
    abstract void grow();
}
class Son extends Parent{
    void grow(){
        System.out.println("�ұȸ��׳ɳ�������");
    }
    void dance(){
        System.out.println("�һ�����");
    }
}
public class test {
    public static void main(String[] args) {
        //��ת�ͣ��ø������������Ķ���
        Parent p=new Son();
        //���ø������еķ���
        p.grow();
        //p.dance();����ᱨ����Ϊ������û��dance()����
        
        //�Խ��й���ת�͵Ķ��󣬽���ǿ����ת��
        Son s=(Son)p;
        //���������еķ���
        s.dance();
    }
}