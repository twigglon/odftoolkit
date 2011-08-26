/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008 Sun Microsystems, Inc. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */    

package org.odftoolkit.odfdom.dom.element.table;

import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.type.OdfBoolean;


/**
 * ODF DOM Element implementation for element "<table:data-pilot-member>".
 */
public abstract class OdfDataPilotMemberElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TABLE, "data-pilot-member" );

    public OdfDataPilotMemberElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }

    /**
     * Initialize mandatory attributes.
     */
    public void init(String _aName)
    {
        setName( _aName );
    }

    /**
     * Get value of attribute "table:name".
     */
    public String getName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "name" ) );
    }

    /**
     * Set value of attribute "table:name".
     */
    public void setName( String _aName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "name" ), _aName );
    }

    /**
     * Get value of attribute "table:display".
     */
    public Boolean getDisplay()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "display" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:display".
     */
    public void setDisplay( Boolean _aDisplay )
    {                    
        String aStringVal = OdfBoolean.toString( _aDisplay );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "display" ), aStringVal );
    }

    /**
     * Get value of attribute "table:show-details".
     */
    public Boolean getShowDetails()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "show-details" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:show-details".
     */
    public void setShowDetails( Boolean _aShowDetails )
    {                    
        String aStringVal = OdfBoolean.toString( _aShowDetails );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "show-details" ), aStringVal );
    }

}
