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
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.type.OdfPositiveInteger;


/**
 * ODF DOM Element implementation for element "<table:table-cell>".
 */
public abstract class OdfTableCellElement extends OdfTableCellElementBase
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TABLE, "table-cell" );

    public OdfTableCellElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME, OdfStyleFamily.TableCell, OdfName.get( OdfNamespace.TABLE, "style-name" ) );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }


    /**
     * Get value of attribute "table:number-columns-spanned".
     */
    public Integer getNumberColumnsSpanned()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "number-columns-spanned" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "1";
        }

        return OdfPositiveInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:number-columns-spanned".
     */
    public void setNumberColumnsSpanned( Integer _aNumberColumnsSpanned )
    {                    
        String aStringVal = OdfPositiveInteger.toString( _aNumberColumnsSpanned );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "number-columns-spanned" ), aStringVal );
    }

    /**
     * Get value of attribute "table:number-rows-spanned".
     */
    public Integer getNumberRowsSpanned()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "number-rows-spanned" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "1";
        }

        return OdfPositiveInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:number-rows-spanned".
     */
    public void setNumberRowsSpanned( Integer _aNumberRowsSpanned )
    {                    
        String aStringVal = OdfPositiveInteger.toString( _aNumberRowsSpanned );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "number-rows-spanned" ), aStringVal );
    }

    /**
     * Get value of attribute "table:number-matrix-columns-spanned".
     */
    public Integer getNumberMatrixColumnsSpanned()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "number-matrix-columns-spanned" ) );
        return OdfPositiveInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:number-matrix-columns-spanned".
     */
    public void setNumberMatrixColumnsSpanned( Integer _aNumberMatrixColumnsSpanned )
    {                    
        String aStringVal = OdfPositiveInteger.toString( _aNumberMatrixColumnsSpanned );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "number-matrix-columns-spanned" ), aStringVal );
    }

    /**
     * Get value of attribute "table:number-matrix-rows-spanned".
     */
    public Integer getNumberMatrixRowsSpanned()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "number-matrix-rows-spanned" ) );
        return OdfPositiveInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:number-matrix-rows-spanned".
     */
    public void setNumberMatrixRowsSpanned( Integer _aNumberMatrixRowsSpanned )
    {                    
        String aStringVal = OdfPositiveInteger.toString( _aNumberMatrixRowsSpanned );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "number-matrix-rows-spanned" ), aStringVal );
    }

}
