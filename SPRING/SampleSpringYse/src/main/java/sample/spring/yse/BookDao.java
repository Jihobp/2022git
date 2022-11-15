package sample.spring.yse;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/*6.4. å DAO Ŭ���� ����
	���� XML�� �����Ű�� DAO(Data Access Object) Ŭ������ �����Ѵ�. src/main/java ���� �׸� sample.spring.yse ��Ű���� ��Ŭ���ؼ� BookDao Ŭ������ ����� �ȴ�.
	Ŭ���� ���� �� �Ʒ� �ڵ带 �Է��Ѵ�.
src/main/java/sample/spring/yse/BookDao.java
 * */
@Repository //import
public class BookDao {
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	
	/*6.5. å �Է� ��� DAO �޼ҵ� ����
	å ������ �Է� ������ �����ϴ� DAO �޼ҵ带 �����.
	src/main/java/sample/spring/yse/BookDao.java*/

	public int insert(Map<String, Object> map) {
		  return this.sqlSessionTemplate.insert("book.insert", map);
	}

	
	/*7.3. å �� DAO �޼ҵ� �ۼ�
	sqlSessionTemplate �� selectOne �޼ҵ�� �����͸� �� ���� ������ �� ����Ѵ�. 
	���� ���� ��� �� ���� 0���� selectOne �޼ҵ�� null�� ��ȯ�ϰ� �Ǹ� ���� ����� ���� ���� 
	TooManyResultsException ���ܸ� ������.
	*/
	
	public Map<String, Object> selectDetail(Map<String, Object> map){
		return this.sqlSessionTemplate.selectOne("book.select_detail", map);
	}

	
	
	//sqlSessionTemplate�� selectOne �޼ҵ�� �����͸� �Ѱ��� ������ �� ����Ѵ�
	//���� ���� ��� �� ���� 0���� slectOne �޼ҵ�� null�� ��ȯ
	//���� ����� ���� ���� TooManyException ���ܸ� ������
	//�츮�� �ۼ��� ������ ������ PK�̰� PK�� ������ ���� ������(Unique)�� �����ϱ� ������ ����� 0�� �ƴϸ� 1����, ���� selectOne�� ����Ѵ�
	//���� ���� ��ȯ���� Map<String, Object> Ÿ���̴�
	//�̴� ���� XML�� resultType�� ��ġ�ؾ� �Ѵ�
	
	//9.3. å ���� ��� DAO �޼ҵ� �ۼ� 
	//sqlSessionTemplate ��ü�� update �޼ҵ�� insert �޼ҵ�� ������ �����ϴ�. 
	//ù��° �Ķ���ʹ� ����ID, �ι�° �Ķ���ʹ� ���� �Ķ�����̸� ��ȯ���� ������� �� ���̴�.
	public int update(Map<String, Object> map) {
		return this.sqlSessionTemplate.update("book.update", map);
		/*int org.mybatis.spring.SqlSessionTemplate.update(String statement, Object
		 * parameter)
		 * Execute an update statement. The number of rows affected will be returned.
		 * 
		 * Specified by: update(...) in SqlSession Parameters:statement Unique
		 * identifier matching the statement to execute.parameter A parameter object to
		 * pass to the statement. Returns:int The number of rows affected by the update.
		 */
	}
	
	//	10.3. å ���� ��� DAO �޼ҵ� �ۼ�
	//	sqlSessionTemplate ��ü�� delete �޼ҵ�� update �޼ҵ�� ������ �����ϴ�. 
	//	ù��° �Ķ���ʹ� ����ID, �ι�° �Ķ���ʹ� ���� �Ķ�����̸� ��ȯ���� ������� �� ���̴�.
	public int delete(Map<String, Object>map) {
		return this.sqlSessionTemplate.delete("book.delete", map);
	}
	
	
	//11.3 å ��� DAO �޼ҵ� �ۼ�
//	���� ����� ������� �ޱ� ���ؼ��� sqlSessionTemplate.selectList�� ����� �� �ִ�. ù��° �Ķ���ʹ� ����ID, �ι�° ID�� ���� �Ķ���ʹ�.
//	sqlSessionTemplate.selectList("book.select_list", map)  
//	sqlSessionTemplate.selectList �޼ҵ�� ��� ���� ����� ��ȯ�Ѵ�. ���� ��� ���� Ÿ���� Map<String, Object>�� ��� List Ÿ������ �о���� �� �ִ�.
//	List<Map<String, Object>>  
	
	public List<Map<String, Object>> selectList(Map<String, Object> map){
		return this.sqlSessionTemplate.selectList("book.select_list", map);
	}
	
}



 