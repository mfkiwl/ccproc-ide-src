/*H*****************************************************************************
*
* Copyright (c) 2018 ChipCraft Sp. z o.o. All rights reserved
*
* This software is subject to the terms of the Eclipse Public License v2.0
* You must accept the terms of that agreement to use this software.
* A copy of the License is available at
* https://www.eclipse.org/legal/epl-2.0
*
* ******************************************************************************
* File Name : TermConsole.java
* Author    : Rafal Harabien
* ******************************************************************************
* $Date: 2019-03-19 12:27:38 +0100 (Tue, 19 Mar 2019) $
* $Revision: 397 $
*H*****************************************************************************/

package com.chipcraftic.eplugin.ui.console;

import org.eclipse.ui.console.IOConsole;

import com.chipcraftic.eplugin.ui.CcUIPlugin;

public class TermConsole extends IOConsole implements ProcessConsole {
	
	private final ProcessConsoleContext context = new ProcessConsoleContext();

	public TermConsole() {
		super("CC Serial Terminal", CcUIPlugin.getImageDescriptor("icons/serial_port.png"));
	}
	
	@Override
	public ProcessConsoleContext getContext() {
		return context;
	}

}
