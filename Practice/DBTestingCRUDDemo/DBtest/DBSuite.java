package DBtest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/*
 * @author Anjali
 */
/*
 * This suite runs CRUD(all the DB tests, i.e, create, read, update, delete) tests for DB together
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ReadDBTest.class,
	                UpdateOrModifyDBTest.class, 
	                CreateTableDBTest.class,
	                DeleteTableDBTest.class})

public class DBSuite 
{

}
