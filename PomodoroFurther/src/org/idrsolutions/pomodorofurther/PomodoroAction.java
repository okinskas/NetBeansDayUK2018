/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.idrsolutions.pomodorofurther;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "File",
        id = "org.idrsolutions.pomodorofurther.PomodoroAction"
)
@ActionRegistration(
        iconBase = "org/idrsolutions/pomodorofurther/clock.png",
        displayName = "#CTL_PomodoroAction"
)
@ActionReferences({
    @ActionReference(path = "Menu/File", position = 0, separatorBefore = -50, separatorAfter = 50)
    ,
  @ActionReference(path = "Toolbars/File", position = 0)
})
@Messages("CTL_PomodoroAction=PomodoroFurther")
public final class PomodoroAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
        PomodoroFurtherTopComponent component = new PomodoroFurtherTopComponent();
        component.open();
    }
}
