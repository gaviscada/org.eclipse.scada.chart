/*******************************************************************************
 * Copyright (c) 2011, 2014 TH4 SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     TH4 SYSTEMS GmbH - initial API and implementation
 *     IBH SYSTEMS GmbH - bug fixes
 *******************************************************************************/
package org.eclipse.scada.chart.swt.render;

import org.eclipse.scada.chart.XAxis;
import org.eclipse.swt.graphics.RGB;

public class PositionXRuler extends AbstractPositionXRuler
{

    private long position;

    public PositionXRuler ( final XAxis axis )
    {
        super ( axis );
        this.color = new RGB ( 0, 0, 0 );
    }

    public void setPosition ( final long position )
    {
        this.position = position;
    }

    @Override
    public Long getPosition ()
    {
        return this.position;
    }

}
