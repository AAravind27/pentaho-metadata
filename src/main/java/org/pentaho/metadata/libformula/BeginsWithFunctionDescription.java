/*! ******************************************************************************
 *
 * Pentaho
 *
 * Copyright (C) 2024 by Hitachi Vantara, LLC : http://www.pentaho.com
 *
 * Use of this software is governed by the Business Source License included
 * in the LICENSE.TXT file.
 *
 * Change Date: 2029-07-20
 ******************************************************************************/

package org.pentaho.metadata.libformula;

import org.pentaho.reporting.libraries.formula.function.AbstractFunctionDescription;
import org.pentaho.reporting.libraries.formula.function.FunctionCategory;
import org.pentaho.reporting.libraries.formula.function.text.TextFunctionCategory;
import org.pentaho.reporting.libraries.formula.typing.Type;
import org.pentaho.reporting.libraries.formula.typing.coretypes.LogicalType;
import org.pentaho.reporting.libraries.formula.typing.coretypes.TextType;

/**
 * Describes the BEGINSWITH function
 * 
 * @author Will Gorman (wgorman@pentaho.com)
 * 
 */
public class BeginsWithFunctionDescription extends AbstractFunctionDescription {

  private static final long serialVersionUID = 8787262061507547672L;

  public BeginsWithFunctionDescription() {
    super( "BeginsWith", "org.pentaho.metadata.libformula.BeginsWith-Function" );
  }

  public FunctionCategory getCategory() {
    return TextFunctionCategory.CATEGORY;
  }

  public int getParameterCount() {
    return 2;
  }

  public Type getParameterType( final int position ) {
    return TextType.TYPE;
  }

  public Type getValueType() {
    return LogicalType.TYPE;
  }

  public boolean isParameterMandatory( final int position ) {
    return true;
  }

}
