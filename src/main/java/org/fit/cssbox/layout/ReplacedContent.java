/*
 * ReplacedContent.java
 * Copyright (c) 2005-2020 Radek Burget
 *
 * CSSBox is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *  
 * CSSBox is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *  
 * You should have received a copy of the GNU Lesser General Public License
 * along with CSSBox. If not, see <http://www.gnu.org/licenses/>.
 *
 * Created on 27.9.2006, 21:15:03 by radek
 */
package org.fit.cssbox.layout;

/**
 * A class that represents the contents of a replaced box
 * 
 * @author radek
 */
public abstract class ReplacedContent
{
	/** The owner box */
	protected ElementBox owner;
    
	//============================================================
	
	public ReplacedContent(ElementBox owner)
	{
		this.owner = owner;
	}
	
	/**
	 * @return the owner
	 */
	public ElementBox getOwner()
	{
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(ElementBox owner)
	{
		this.owner = owner;
	}

    /**
     * Loads the size definitions from appropriate node attributes or CSS properties
     */
    public void loadSizeDefs()
    {
    }
    
    /**
     * Compute the content layout in the owner area
     */
    public void doLayout()
    {
        //the default behaviour is to do remove the child nodes from the owner object if any
        //because the box is replaced by the content
        owner.removeAllSubBoxes();
    }
    
    /**
     * Computes the absolute positions in the content if necessary.
     */
    public void absolutePositions()
    {
        //the default is to do nothing
    }
    
    /**
     * @return the intrinsic width of the contents
     */
    abstract public float getIntrinsicWidth();

    /**
     * @return the intrinsic height of the contents
     */
    abstract public float getIntrinsicHeight();

    /**
     * @return the intrinsic width/height ratio. If the object has no ratio, 0 is returned
     */
    abstract public float getIntrinsicRatio();
    
    
}
