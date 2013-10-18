/* 
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.oyrm.kobo.postproc.ui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JApplet;
import javax.swing.JFrame;

import org.oyrm.kobo.postproc.constants.Constants;

/**
 * This extension of JFrame handles instantiation, property persistence, user interactivity,
 * and an entry point to the central functionality of the org.oyrm.kobo.postproc package
 * @author Gary Hendrick
 */



public class KoboPostProcApplet extends JApplet implements WindowListener {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7844397748104170434L;
	
	private KoboPostProcPanel ppPanel = null;
	private Container container = null;
	
	/** Because a lot of the dialogs and stuff need a frame to latch onto*/
	private JFrame frame = null;
	
	public KoboPostProcApplet() throws HeadlessException {
		super();
		
		
	}





	public void init() {
		
		setupAppletText();

		/**
		 * Set up the contentPane JPanel instance along with the additional
		 * JPanels to create the appropriate layout
		 */
		
		container = getContentPane();				
		
		frame = new JFrame();
		
		ppPanel = KoboPostProcPanel.getInstance(frame);
		
		container.add(ppPanel);  // Generated

		container.validate();
		setVisible(true);
		
		this.setPreferredSize(new Dimension(500,400));
		
	}
	
	
	/**
	 * Used to set text in the applet from text passed to the
	 * applet via parameters 
	 */
	private void setupAppletText() {
		
		String txt = null;
		
		txt = getParameter("XML_AGGREGATE_COMMAND");
		if(txt!=null) KoboPostProcPanel.setAppText(Constants.XML_AGGREGATE_COMMAND, txt);
		txt = getParameter("CSV_CONVERT_COMMAND");
		if(txt!=null) KoboPostProcPanel.setAppText(Constants.CSV_CONVERT_COMMAND, txt);
		txt = getParameter("STATUS_INIT");
		if(txt!=null) KoboPostProcPanel.setAppText(Constants.STATUS_INIT, txt);
		txt = getParameter("COUNTER_SYNC_TEXT");
		if(txt!=null) KoboPostProcPanel.setAppText(Constants.COUNTER_SYNC_TEXT, txt);
		txt = getParameter("COUNTER_TRANS_TEXT");
		if(txt!=null) KoboPostProcPanel.setAppText(Constants.COUNTER_TRANS_TEXT, txt);
		txt = getParameter("BROWSE_TEXT"); 
		if(txt!=null) KoboPostProcPanel.setAppText(Constants.BROWSE_TEXT, txt);
		txt = getParameter("CHANGE_CSV_DIR_TEXT");
		if(txt!=null) KoboPostProcPanel.setAppText(Constants.CHANGE_CSV_DIR_TEXT, txt);
		txt = getParameter("CHANGE_SRC_DIR_TEXT");
		if(txt!=null) KoboPostProcPanel.setAppText(Constants.CHANGE_SRC_DIR_TEXT, txt);
		txt = getParameter("CHANGE_XML_DIR_TEXT");
		if(txt!=null) KoboPostProcPanel.setAppText(Constants.CHANGE_XML_DIR_TEXT, txt);
		txt = getParameter("CSV_CONVERT_PROC_COMPLETE_TEXT");
		if(txt!=null) KoboPostProcPanel.setAppText(Constants.CSV_CONVERT_PROC_COMPLETE_TEXT, txt);
		txt = getParameter("TASK_COMPLETED_TEXT");
		if(txt!=null) KoboPostProcPanel.setAppText(Constants.TASK_COMPLETED_TEXT, txt);
		txt = getParameter("COMPLETED_PERCENT_TEXT");
		if(txt!=null) KoboPostProcPanel.setAppText(Constants.COMPLETED_PERCENT_TEXT, txt);
		txt = getParameter("XML_AGGREGATE_COMPLETE_TEXT");
		if(txt!=null) KoboPostProcPanel.setAppText(Constants.XML_AGGREGATE_COMPLETE_TEXT, txt);
		txt = getParameter("RETRY_TEXT");
		if(txt!=null) KoboPostProcPanel.setAppText(Constants.RETRY_TEXT, txt);
		txt = getParameter("SET_TEXT");
		if(txt!=null) KoboPostProcPanel.setAppText(Constants.SET_TEXT, txt);
		txt = getParameter("STRING_NODIR_MESSAGE");
		if(txt!=null) KoboPostProcPanel.setAppText(Constants.STRING_NODIR_MESSAGE, txt);
		txt = getParameter("STRING_NODIR_CSV");
		if(txt!=null) KoboPostProcPanel.setAppText(Constants.STRING_NODIR_CSV, txt);
		txt = getParameter("STRING_NODIR_TITLE");
		if(txt!=null) KoboPostProcPanel.setAppText(Constants.STRING_NODIR_TITLE, txt);
		txt = getParameter("STARTING_TEXT");
		if(txt!=null) KoboPostProcPanel.setAppText(Constants.STARTING_TEXT, txt);
		txt = getParameter("WRITING_XML_TO_STORAGE");
		if(txt!=null) KoboPostProcPanel.setAppText(Constants.WRITING_XML_TO_STORAGE, txt);
		txt = getParameter("CONVERT_TO_CSV_TASK_TEXT");
		if(txt!=null) KoboPostProcPanel.setAppText(Constants.CONVERT_TO_CSV_TASK_TEXT, txt);
		txt = getParameter("AGGREGATE_XML_TASK_TEXT");
		if(txt!=null) KoboPostProcPanel.setAppText(Constants.AGGREGATE_XML_TASK_TEXT, txt);
		txt = getParameter("DIR_PREF_SET_TEXT");
		if(txt!=null) KoboPostProcPanel.setAppText(Constants.DIR_PREF_SET_TEXT, txt);
		txt = getParameter("STATUS_TEXT");
		if(txt!=null) KoboPostProcPanel.setAppText(Constants.STATUS_TEXT, txt);
		txt = getParameter("CONVERT_TO_CSV_TEXT");
		if(txt!=null) KoboPostProcPanel.setAppText(Constants.CONVERT_TO_CSV_TEXT, txt);
		txt = getParameter("AGGREGATE_XML_TEXT");
		if(txt!=null) KoboPostProcPanel.setAppText(Constants.AGGREGATE_XML_TEXT, txt);
		txt = getParameter("COUNTER_TEXT");
		if(txt!=null) KoboPostProcPanel.setAppText(Constants.COUNTER_TEXT, txt);
		txt = getParameter("SURVEY_INSTANCES_TEXT");
		if(txt!=null) KoboPostProcPanel.setAppText(Constants.SURVEY_INSTANCES_TEXT, txt);
		txt = getParameter("SAVE_TO_CSV_TEXT");
		if(txt!=null) KoboPostProcPanel.setAppText(Constants.SAVE_TO_CSV_TEXT, txt);
		txt = getParameter("AGGREGATE_TO_TEXT");
		if(txt!=null) KoboPostProcPanel.setAppText(Constants.AGGREGATE_TO_TEXT, txt);
		
	}





	public void windowClosed(WindowEvent e) {}

	public void windowClosing(WindowEvent e) {
		ppPanel.exit();
	}

	public void windowActivated(WindowEvent e) {	}

	public void windowDeactivated(WindowEvent e) {	}

	public void windowDeiconified(WindowEvent e) {	}

	public void windowIconified(WindowEvent e) {	}

	public void windowOpened(WindowEvent e) {	}
}