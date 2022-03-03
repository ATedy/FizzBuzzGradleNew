package com.buildExample;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;

public class FizzBuzzXmlOutput {

  public static void main(String[] args) {
    ArrayList<Integer> fizzBuzzOutputHolder = getFizzBuzzOutput(70, 10);
    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder dBuilder;
    try {
      dBuilder = dbFactory.newDocumentBuilder();
      Document doc = dBuilder.newDocument();
      //add elements to Document
      Element rootElement =
          doc.createElementNS("", "FizzBuzz-Outputs");
      //append root element to document
      doc.appendChild(rootElement);

      //append first child element to root element
      Element Fizz = doc.createElement("Fizz");
      Fizz.appendChild(doc.createTextNode(fizzBuzzOutputHolder.get(0).toString()));
      rootElement.appendChild(Fizz);

      //append second child
      Element Buzz = doc.createElement("Buzz");
      Buzz.appendChild(doc.createTextNode(fizzBuzzOutputHolder.get(1).toString()));
      rootElement.appendChild(Buzz);

      //append second child
      Element FizzBuzz = doc.createElement("FizzBuzz");
      FizzBuzz.appendChild(doc.createTextNode(fizzBuzzOutputHolder.get(2).toString()));
      rootElement.appendChild(FizzBuzz);

      //for output to file, console
      TransformerFactory transformerFactory = TransformerFactory.newInstance();
      Transformer transformer = transformerFactory.newTransformer();

      //for pretty print
      transformer.setOutputProperty(OutputKeys.INDENT, "YES");
      DOMSource source = new DOMSource(doc);

      //write to console or file
      StreamResult console = new StreamResult(System.out);
      StreamResult file = new StreamResult(
          new File("Java-Fundamentals\\outputXml.xml"));

      //write(transforming) data
      transformer.transform(source, console);
      transformer.transform(source, file);

    } catch (Exception e) {
      e.printStackTrace();
    }

  }
  private static ArrayList<Integer> getFizzBuzzOutput(int a, int b) {
    int fizzCount = 0, buzzCount = 0, fizzBuzzCount = 0;
    ArrayList<Integer> fizzBuzzArr = new ArrayList<>();

    int smaller = Math.min(a, b);
    int bigger = Math.max(a, b);

    while (smaller < bigger) {
      if (smaller % 3 == 0 && smaller % 5 == 0) {
        fizzBuzzCount++;
      } else if (smaller % 3 == 0) {
        fizzCount++;
      } else if (smaller % 5 == 0) {
        buzzCount++;
      }
      smaller++;
    }
    fizzBuzzArr.add(fizzCount);
    fizzBuzzArr.add(buzzCount);
    fizzBuzzArr.add(fizzBuzzCount);
    System.out.println(fizzBuzzArr);
    return fizzBuzzArr;

  }


}
