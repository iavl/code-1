package cn.itcast.b_create_obj;

// ��������������
public class ObjectFactory {

	// ʵ��������������
	public User getInstance() {
		return new User(100,"����������ʵ������");
	}
	
	// ��̬������������
	public static User getStaticInstance() {
		return new User(101,"���������þ�̬����");
	}
}