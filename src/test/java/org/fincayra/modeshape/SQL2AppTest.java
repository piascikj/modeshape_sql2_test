package org.fincayra.modeshape;

import static org.junit.Assert.assertTrue;

import javax.jcr.RepositoryException;
import javax.jcr.query.QueryResult;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class SQL2AppTest {
	private static final String CLUSTER_BOTH_INFINISPAN = "clusterBoth.xml";
	private static final String HSQLDB_SOURCE = "hsqldbSource.xml";
	private static final String HSQLDB_SOURCE_MODESHAPE_CLUSTER = "hsqldbSourceModeShapeCluster.xml";

	private static SQL2App testApp = SQL2App.getInstance();
	
	public SQL2AppTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Before
	public void beforeEach() {
		testApp.destroy();
	}
	
	@After
	public void afterEach() {
		//Shutdown the engine
		testApp.stop();
	}

	@AfterClass
	public static void afterAll() {
		testApp.destroy();	
	}
	
	@Test
	public void testSQL2_name_CLUSTER_BOTH_INFINISPAN() {

		//Run query
		QueryResult result = inprocessTest(CLUSTER_BOTH_INFINISPAN, SQL2App.NAME_QUERY);
		
		//This should return at least one result, More if the repository wasn't deleted
		try {
			assertTrue("Query result is empty",result.getNodes().getSize() > 0);
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testSQL2_name_HSQLDB_SOURCE() {

		//Run query
		QueryResult result = inprocessTest(HSQLDB_SOURCE, SQL2App.NAME_QUERY);
		
		//This should return at least one result, More if the repository wasn't deleted
		try {
			assertTrue("Query result is empty",result.getNodes().getSize() > 0);
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testSQL2_name_HSQLDB_SOURCE_MODESHAPE_CLUSTER() {

		//Run query
		QueryResult result = inprocessTest(HSQLDB_SOURCE_MODESHAPE_CLUSTER, SQL2App.NAME_QUERY);
		
		//This should return at least one result, More if the repository wasn't deleted
		try {
			assertTrue("Query result is empty",result.getNodes().getSize() > 0);
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
	
	@Test
	public void testSQL2_name_CLUSTER_BOTH_INFINISPAN_Shutdown() {
		System.out.println("SQL2Infinispan Instance:" + testApp.hashCode());
		
		QueryResult result = shutdownTest(CLUSTER_BOTH_INFINISPAN, SQL2App.NAME_QUERY);
		
		//This should return at least one result, More if the repository wasn't deleted
		try {
			assertTrue("Query result is empty",result.getNodes().getSize() > 0);
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testSQL2_name_HSQLDB_SOURCE_Shutdown() {

		QueryResult result = shutdownTest(HSQLDB_SOURCE, SQL2App.NAME_QUERY);
		
		//This should return at least one result, More if the repository wasn't deleted
		try {
			assertTrue("Query result is empty",result.getNodes().getSize() > 0);
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Test
	public void testSQL2_name_HSQLDB_SOURCE_MODESHAPE_CLUSTER_Shutdown() {
		
		QueryResult result = shutdownTest(HSQLDB_SOURCE_MODESHAPE_CLUSTER, SQL2App.NAME_QUERY);
		
		//This should return at least one result, More if the repository wasn't deleted
		try {
			assertTrue("Query result is empty",result.getNodes().getSize() > 0);
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//--------------------------------------------------------
	
	@Test
	public void testSQL2_cast_CLUSTER_BOTH_INFINISPAN() {

		//Run query
		QueryResult result = inprocessTest(CLUSTER_BOTH_INFINISPAN, SQL2App.CAST_QUERY);
		
		//This should return at least one result, More if the repository wasn't deleted
		try {
			assertTrue("Query result is empty",result.getNodes().getSize() > 0);
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testSQL2_cast_HSQLDB_SOURCE() {

		//Run query
		QueryResult result = inprocessTest(HSQLDB_SOURCE, SQL2App.CAST_QUERY);
		
		//This should return at least one result, More if the repository wasn't deleted
		try {
			assertTrue("Query result is empty",result.getNodes().getSize() > 0);
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testSQL2_cast_HSQLDB_SOURCE_MODESHAPE_CLUSTER() {

		//Run query
		QueryResult result = inprocessTest(HSQLDB_SOURCE_MODESHAPE_CLUSTER, SQL2App.CAST_QUERY);
		
		//This should return at least one result, More if the repository wasn't deleted
		try {
			assertTrue("Query result is empty",result.getNodes().getSize() > 0);
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
	
	@Test
	public void testSQL2_cast_CLUSTER_BOTH_INFINISPAN_Shutdown() {
		System.out.println("SQL2Infinispan Instance:" + testApp.hashCode());
		
		QueryResult result = shutdownTest(CLUSTER_BOTH_INFINISPAN, SQL2App.CAST_QUERY);
		
		//This should return at least one result, More if the repository wasn't deleted
		try {
			assertTrue("Query result is empty",result.getNodes().getSize() > 0);
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testSQL2_cast_HSQLDB_SOURCE_Shutdown() {

		QueryResult result = shutdownTest(HSQLDB_SOURCE, SQL2App.CAST_QUERY);
		
		//This should return at least one result, More if the repository wasn't deleted
		try {
			assertTrue("Query result is empty",result.getNodes().getSize() > 0);
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Test
	public void testSQL2_cast_HSQLDB_SOURCE_MODESHAPE_CLUSTER_Shutdown() {
		
		QueryResult result = shutdownTest(HSQLDB_SOURCE_MODESHAPE_CLUSTER, SQL2App.CAST_QUERY);
		
		//This should return at least one result, More if the repository wasn't deleted
		try {
			assertTrue("Query result is empty",result.getNodes().getSize() > 0);
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public QueryResult inprocessTest(String config, String query) {
		testApp.start(config);
		
		//Now lets add some types and properties
		testApp.configTypes();
	
		//Now add some data
		testApp.addData();
		
		//Run query
		return testApp.runQuery(query);
	}
	
	public QueryResult shutdownTest(String config, String query) {
		testApp.start(config);
		
		//Now lets add some types and properties
		testApp.configTypes();
	
		//Now add some data
		testApp.addData();
		
		//Shutdown the engine
		testApp.stop();

		testApp.start(config);

		//Run query
		return testApp.runQuery(query);	
	}
}
