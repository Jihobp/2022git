package sample.spring.yse;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/*6.4. 책 DAO 클래스 생성
	매퍼 XML을 실행시키는 DAO(Data Access Object) 클래스를 생성한다. src/main/java 하위 항목 sample.spring.yse 패키지를 우클릭해서 BookDao 클래스를 만들면 된다.
	클래스 생성 후 아래 코드를 입력한다.
src/main/java/sample/spring/yse/BookDao.java
 * */
@Repository //import
public class BookDao {
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	
	/*6.5. 책 입력 기능 DAO 메소드 생성
	책 데이터 입력 쿼리를 실행하는 DAO 메소드를 만든다.
	src/main/java/sample/spring/yse/BookDao.java*/

	public int insert(Map<String, Object> map) {
		  return this.sqlSessionTemplate.insert("book.insert", map);
	}

	
	/*7.3. 책 상세 DAO 메소드 작성
	sqlSessionTemplate 의 selectOne 메소드는 데이터를 한 개만 가져올 때 사용한다. 
	만약 쿼리 결과 행 수가 0개면 selectOne 메소드는 null을 반환하게 되며 쿼리 결과가 여러 개면 
	TooManyResultsException 예외를 던진다.
	*/
	
	public Map<String, Object> selectDetail(Map<String, Object> map){
		return this.sqlSessionTemplate.selectOne("book.select_detail", map);
	}

	
	
	//sqlSessionTemplate의 selectOne 메소드는 데이터를 한개만 가져올 때 사용한다
	//만약 쿼리 결과 행 수가 0개면 slectOne 메소드는 null을 반환
	//쿼리 결과가 여러 개면 TooManyException 예외를 던진다
	//우리가 작성한 쿼리는 조건이 PK이고 PK는 무조건 행이 유일한(Unique)을 보장하기 때문에 결과는 0개 아니면 1개다, 따라서 selectOne을 사용한다
	//쿼리 실행 반환값이 Map<String, Object> 타입이다
	//이는 매퍼 XML의 resultType과 일치해야 한다
	
	//9.3. 책 수정 기능 DAO 메소드 작성 
	//sqlSessionTemplate 객체의 update 메소드는 insert 메소드와 사용법이 동일하다. 
	//첫번째 파라미터는 쿼리ID, 두번째 파라미터는 쿼리 파라미터이며 반환값은 영향받은 행 수이다.
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
	
	//	10.3. 책 삭제 기능 DAO 메소드 작성
	//	sqlSessionTemplate 객체의 delete 메소드는 update 메소드와 사용법이 동일하다. 
	//	첫번째 파라미터는 쿼리ID, 두번째 파라미터는 쿼리 파라미터이며 반환값은 영향받은 행 수이다.
	public int delete(Map<String, Object>map) {
		return this.sqlSessionTemplate.delete("book.delete", map);
	}
	
	
	//11.3 책 목록 DAO 메소드 작성
//	쿼리 결과를 목록으로 받기 위해서는 sqlSessionTemplate.selectList를 사용할 수 있다. 첫번째 파라미터는 쿼리ID, 두번째 ID는 쿼리 파라미터다.
//	sqlSessionTemplate.selectList("book.select_list", map)  
//	sqlSessionTemplate.selectList 메소드는 결과 집합 목록을 반환한다. 따라서 결과 집합 타입인 Map<String, Object>의 목록 List 타입으로 읽어들일 수 있다.
//	List<Map<String, Object>>  
	
	public List<Map<String, Object>> selectList(Map<String, Object> map){
		return this.sqlSessionTemplate.selectList("book.select_list", map);
	}
	
}



 