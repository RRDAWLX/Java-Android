import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DOMParser {
	DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
	
	public Document parse(String filePath){
		Document document = null;
		
		try{
			DocumentBuilder builder = builderFactory.newDocumentBuilder();
			document = builder.parse(new File(filePath));
		}catch(ParserConfigurationException e){
			e.printStackTrace();
		}catch(SAXException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		return document;
	}
	
	public static void main(String[] args){
		DOMParser parser = new DOMParser();
		Document document = parser.parse("books.xml");
		
		Element rootElement = document.getDocumentElement();
		
		NodeList nodes = rootElement.getChildNodes();
		for(int i = 0; i < nodes.getLength(); i++){
			Node node = nodes.item(i);
			if(node.getNodeType() == Node.ELEMENT_NODE){
				Element child = (Element)node;
			}
		}
		
		NodeList nodeList = rootElement.getElementsByTagName("book");
		if(nodeList != null){
			for(int i = 0; i < nodeList.getLength(); i++){
				Element element = (Element)nodeList.item(i);
				String id = element.getAttribute("id");
			}
		}
	}
}
