import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;


public class StaxParserDemo 
{
	public static void main(String[] args) throws XMLStreamException, FileNotFoundException
	{
		List<Details> nameList=null;
		Details curName=null;
		String tagContent=null;
		
		//XMLINputFactory and XMLStreamReader are needed for loading the xml doc
		XMLInputFactory factory=XMLInputFactory.newInstance();
		XMLStreamReader reader=factory.createXMLStreamReader(new FileInputStream("/Path to/Demo.xml"));
		//XMLStreamReader reader=factory.createXMLStreamReader(ClassLoader.getSystemResourceAsStream("/home/shally/GSOC-2015/Workspace/" +
			//	             	 "Local_Workspace/Practice/XML/Demo.xml"));//gives only read only access to xml file
		
		while(reader.hasNext())//reader points to the xml doc
		{
			int event=reader.next();
			switch(event)
			{
			case XMLStreamConstants.START_ELEMENT:if("Detail".equals(reader.getLocalName()))
			                                       {
				                                     curName=new Details();
				                                     curName.id=reader.getAttributeValue(0);
			                                       }
			                                       if("Details".equals(reader.getLocalName()))
			                                       {
			                                    	  nameList=new ArrayList<>();
			                                       }
			                                      break;
			case XMLStreamConstants.CHARACTERS   :tagContent=reader.getText().trim();
			                                      break;
			case XMLStreamConstants.END_ELEMENT  :switch(reader.getLocalName())
			                                      {
			                                       case "Detail":nameList.add(curName);
			                                                     break;
			                                       case "Firstname":curName.firstname=tagContent;
			                                                        break;
			                                       case "Lastname" :curName.lastname=tagContent;
			                                                        break;
			                                       case "City"     :curName.City=tagContent;
			                                                        break;
			                                      }
			                                      break;
			case XMLStreamConstants.START_DOCUMENT:nameList=new ArrayList<>();
			                                       break;
			                                       
             
            }
			
		}
		//Print 
		for(Details d:nameList)
		{
			System.out.println(d);
		} 

	}

}
