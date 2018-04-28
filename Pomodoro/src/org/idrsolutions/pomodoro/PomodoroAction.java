/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.idrsolutions.pomodoro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "File",
        id = "org.idrsolutions.pomodoro.PomodoroAction"
)
@ActionRegistration(
        iconBase = "org/idrsolutions/pomodoro/clock.png",
        displayName = "#CTL_PomodoroActionButton"
)
@ActionReferences({
    @ActionReference(path = "Menu/File", position = -300, separatorBefore = -350, separatorAfter = -250)
    ,
  @ActionReference(path = "Toolbars/File", position = 0)
})
@Messages("CTL_PomodoroActionButton=Pomodoro")
public final class PomodoroAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
        PomodoroTopComponent component = new PomodoroTopComponent();
        component.open();
    }
}
