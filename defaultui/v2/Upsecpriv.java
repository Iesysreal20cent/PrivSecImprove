import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import javax.swing.*;
//v2,assume dtbase is named as dt.json
/*
    These data is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    These data is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with These data.  If not, see <https://www.gnu.org/licenses/>.
    */
//https://docs.oracle.com/javase/7/docs/api/javax/swing/JScrollPane.html
//v2,assume dtbase is named as dt.json
public class Upsecpriv{
	
	static JFrame f;
	//https://www.geeksforgeeks.org/java-swing-jlist-with-examples/
	//https://www.tutorialspoint.com/swing/swing_jbutton.htm
	//https://stackoverflow.com/questions/10576111/how-to-add-a-list-of-jbuttons-to-a-jframe
	public static void main(String[] args){
	String jsonflname="dt";
		if(needhelp(jsonflname)){return "Give the json filename,it should be in the plugin folder too.";}
		else{
		f=new JFrame();//creating instance of JFrame
		        
	    f.setSize(400,500);//400 width and 500 height  
	   //https://stackoverflow.com/questions/22366126/how-to-use-an-arraylist-to-manage-many-jbuttons
	    
	    // javax.swing.JScrollPane gridPane =new javax.swing.JScrollPane();
		try{
		String jsonfilename=jsonflname+".json";
        	org.json.JSONObject jsonobj=parsefileasjson(jsonfilename,java.nio.charset.StandardCharsets.UTF_8);
		if(jsonobj!=null){
		//b= new JList(week);javax.swing.JButton,listbtn.setPrefWidth(100);listbtn.setPrefHeight(70);
		if(jsonobj.length()>20){
			String fullstr=org.json.JSONObject.valueToString(jsonobj);
			//need to frakaing soplit the map or the gddm json.!
			//https://stackoverflow.com/questions/50871243/splitting-a-hashmap-into-two-smaller-maps
			//import collectors
			java.util.Map<String,Object> map =jsonobj.toMap();
java.util.concurrent.atomic.AtomicInteger counter = new java.util.concurrent.atomic.AtomicInteger(0);
java.util.Map<Boolean,java.util.Map<String,Object>> collect = map.entrySet()
    .stream()
   .collect(java.util.stream.Collectors.partitioningBy(
       e -> counter.getAndIncrement() < map.size() / 2, // this splits the map into 2 parts
       java.util.stream.Collectors.toMap(
           java.util.Map.Entry::getKey, 
           java.util.Map.Entry::getValue
       )
   ));
			org.json.JSONObject part1=new org.json.JSONObject(map.get(true).toString());
			org.json.JSONObject part2=new org.json.JSONObject(map.get(false).toString());
			
			java.io.FileWriter part1wt=new java.io.FileWriter(jsonfilename);
			java.io.FileWriter part2wt=new java.io.FileWriter(jsonflname+"1.json");
			
			//https://www.tutorialspoint.com/java/java_filewriter_class.htm
			part1.write(part1wt).flush();part1wt.close();
			part2.write(part1wt).flush();part2wt.close();
			//take part 1 write onto the src json,take part2 write into a new json
			
			//recall this class with json 1 and two
			}
		java.util.Map<java.lang.String,java.lang.Object> jsonmap=jsonobj.toMap();
		javax.swing.JButton[] array = new javax.swing.JButton[jsonmap.size()];
		f.setLayout(new java.awt.GridLayout(0,1));//https://docs.oracle.com/javase/tutorial/uiswing/layout/grid.html
		int e=0;
		for(java.util.Map.Entry<java.lang.String,java.lang.Object> oneln:jsonmap.entrySet()){
		javax.swing.JButton linkbutton =new javax.swing.JButton(oneln.getKey()+">"+oneln.getValue().toString());
		linkbutton.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent e) {
           		Clipboard cb=Toolkit.getDefaultToolkit().getSystemClipboard();
			StringSelection ss=new StringSelection(oneln.getValue().toString());
			cb.setContents(ss,null);
		   }
		});
		f.add(linkbutton);e++;
		}
		//JScrollPane sp = new JScrollPane(b);https://docs.oracle.com/javase/tutorial/uiswing/components/scrollpane.html
	    	//f.add();//adding button in JFrame  
		f.setVisible(true);//making the frame visible
		}
		}catch(Exception e){e.printStackTrace();}
		return "ok";}
	
	}
	/**
	@param abslfilepath.The freaking file absolutepath
	@param contentcharset.can be easily obtained from java.nio.charset.StandardCharsets
	*@return a org.json.JSONObject object.If fail will have no content
	eg,"lol.json"
	*/
	private final org.json.JSONObject parsefileasjson(String jsonfilename,java.nio.charset.Charset contentcharset){
		if(getClass().getResource(jsonfilename)!=null){
		try{java.nio.file.Path refpath;
			if(java.io.File.separator.equals("/")){refpath=java.nio.file.Paths.get(getClass().getResource(jsonfilename).toString().substring(5).replace("%20"," "));}
			else{refpath=java.nio.file.Paths.get(getClass().getResource(jsonfilename).toString().substring(6));}
			return new org.json.JSONObject(new String(java.nio.file.Files.readAllBytes(refpath),contentcharset));
		}catch(Exception e){e.printStackTrace();return new org.json.JSONObject("");}	
		}else{return null;}
	}
	
	/**
	@param abslfilepath.The freaking file absolutepath
	@param contentcharset.can be easily obtained from java.nio.charset.StandardCharsets
	*@return a org.json.JSONObject object.If fail will have no content
	eg,"lol.json"
	*/
	private final String resolvelocalpath(String jsonfilename){
	try{String currfilelayer=new java.io.File(Upsecpriv.class.getProtectionDomain().getCodeSource().getLocation().toURI()).toString();
		return currfilelayer;
	}catch(Exception e){e.printStackTrace();return ".";}	
	}
	
	//for cmd line style use..
	public static boolean needhelp(String cmd){
		switch(cmd){case ">help":return true;
		case "HELP!":return true;
		default:return false;}		
	}
		
}
