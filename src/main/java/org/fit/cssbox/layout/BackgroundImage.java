/*
 * BackgroundImage.java
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
 * Created on 11.6.2012, 14:47:16 by burgetr
 */
package org.fit.cssbox.layout;

import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cz.vutbr.web.css.CSSProperty;
import cz.vutbr.web.css.CSSProperty.BackgroundAttachment;
import cz.vutbr.web.css.CSSProperty.BackgroundOrigin;
import cz.vutbr.web.css.CSSProperty.BackgroundPosition;
import cz.vutbr.web.css.CSSProperty.BackgroundRepeat;
import cz.vutbr.web.css.CSSProperty.BackgroundSize;
import cz.vutbr.web.css.Term;
import cz.vutbr.web.css.TermLengthOrPercent;
import cz.vutbr.web.css.TermList;

/**
 * An image placed at the element background together with its position and repeating.
 * 
 * @author burgetr
 */
public abstract class BackgroundImage
{
    private static Logger log = LoggerFactory.getLogger(BackgroundImage.class);

    private CSSProperty.BackgroundPosition position;
    private CSSProperty.BackgroundRepeat repeat;
    private CSSProperty.BackgroundAttachment attachment;
    private CSSProperty.BackgroundOrigin origin;
    private CSSProperty.BackgroundSize size;
    private TermList positionValues;
    private TermList sizeValues;

    private ElementBox owner;
    
    //the coordinates of the image within the element
    private float imgx;
    private float imgy;
    private float imgw;
    private float imgh;
    private boolean repeatx;
    private boolean repeaty;
    
    
    /**
     * Ceates a new background image with the specified CSS property values.
     * @param owner
     * @param url
     * @param position
     * @param positionValues
     * @param repeat
     * @param attachment
     * @param origin
     * @param size
     * @param sizeValues
     */
    public BackgroundImage(ElementBox owner, URL url, BackgroundPosition position, TermList positionValues, 
                            BackgroundRepeat repeat, BackgroundAttachment attachment, BackgroundOrigin origin,
                            BackgroundSize size, TermList sizeValues)
    {
        setOwner(owner);
        this.position = position;
        this.positionValues = positionValues;
        this.size = size;
        this.sizeValues = sizeValues;
        this.repeat = repeat;
        this.attachment = attachment;
        this.origin = origin;
        repeatx = (repeat == BackgroundRepeat.REPEAT || repeat == BackgroundRepeat.REPEAT_X);
        repeaty = (repeat == BackgroundRepeat.REPEAT || repeat == BackgroundRepeat.REPEAT_Y);
    }

    /**
     * Obtains the element box the background belongs to.
     * @return
     */
    public ElementBox getOwner()
    {
        return owner;
    }
    
    public void setOwner(ElementBox owner)
    {
        this.owner = owner;
    }

    /**
     * Obtains the used value of the CSS <code>background-position</code> property
     * for this image.
     * @return
     */
    public CSSProperty.BackgroundPosition getPosition()
    {
        return position;
    }

    /**
     * Obtains the used value of the CSS <code>background-repeat</code> property.
     * for this image.
     * @return
     */
    public CSSProperty.BackgroundRepeat getRepeat()
    {
        return repeat;
    }

    /**
     * Obtains the used value of the CSS <code>background-attachment</code> property.
     * for this image.
     * @return
     */
    public CSSProperty.BackgroundAttachment getAttachment()
    {
        return attachment;
    }
    
    /**
     * Obtains the used value of the CSS <code>background-origin</code> property.
     * for this image.
     * @return
     */
    public CSSProperty.BackgroundOrigin getOrigin()
    {
        return origin;
    }

    /**
     * Obtains the used value of the CSS <code>background-size</code> property.
     * for this image.
     * @return
     */
    public CSSProperty.BackgroundSize getSize()
    {
        return size;
    }
    
    /**
     * Computes the coordinates of the image within the owner element border box.
     * @return the coordinates within the owning element border box
     */
    public Rectangle getComputedPosition()
    {
        computeCoordinates(getOwner());
        return new Rectangle(imgx, imgy, imgw, imgh);
    }

    /**
     * Computes the coordinates of the image within the specified element border box.
     * @return the coordinates within the owning element border box
     */
    public Rectangle getComputedPosition(ElementBox contextBox)
    {
        computeCoordinates(contextBox);
        return new Rectangle(imgx, imgy, imgw, imgh);
    }

    /**
     * Obtains the used value of the repeat-x CSS property.
     * @return <code>true</code> if the image is repeated in the X direction
     */
    public boolean isRepeatX()
    {
        return repeatx;
    }

    /**
     * Obtains the used value of the repeat-y CSS property.
     * @return <code>true</code> if the image is repeated in the Y direction
     */
    public boolean isRepeatY()
    {
        return repeaty;
    }

    //===========================================================================
    
    /**
     * Obtains the intrinsic width of the image.
     * @return the intrinsic width
     */
    public abstract float getIntrinsicWidth();

    /**
     * Checks whether the image has an intrinsic width.
     * @return {@code true} when the image has an intrinsic width
     */
    public abstract boolean hasIntrinsicWidth();
    
    /**
     * Obtains the intrinsic height of the image.
     * @return the intrinsic height
     */
    public abstract float getIntrinsicHeight();

    /**
     * Checks whether the image has an intrinsic height.
     * @return {@code true} when the image has an intrinsic height
     */
    public abstract boolean hasIntrinsicHeight();
    
    /**
     * Obtains the intrinsic aspect ratio of the image (width / height).
     * @return the intrinsic aspect ratio
     */
    public abstract float getIntrinsicRatio();
    
    /**
     * Checks whether the image has an intrinsic ratio.
     * @return {@code true} when the image has an intrinsic ratio
     */
    public abstract boolean hasIntrinsicRatio();
    
    //===========================================================================
    
    protected float getAutoWidth(Rectangle bounds)
    {
        return hasIntrinsicWidth() ? getIntrinsicWidth() : bounds.width;
    }
    
    protected float getAutoHeight(Rectangle bounds)
    {
        return hasIntrinsicHeight() ? getIntrinsicHeight() : bounds.height;
    }
    
    //===========================================================================
    
    /**
     * Gets the computed X coordinate of the image within the owner element border box.
     * @return the x coordinate
     */
    public float getImgX()
    {
        return imgx;
    }

    /**
     * Gets the computed Y coordinate of the image within the owner element border box.
     * @return the y coordinate
     */
    public float getImgY()
    {
        return imgy;
    }
    
    /**
     * Gets the computed image width.
     * @return the image width
     */
    public float getImgWidth()
    {
        return imgw;
    }

    /**
     * Gets the computed image height.
     * @return the image height
     */
    public float getImgHeight()
    {
        return imgh;
    }

    /**
     * Computes the image coordinates within the border box of the element according to the origin.
     */
    protected void computeCoordinates(ElementBox contextBox)
    {
        switch (getOrigin())
        {
            case BORDER_BOX:
                computeCoordinates(contextBox.getAbsoluteBorderBounds(), contextBox);
                break;
            case CONTENT_BOX:
                computeCoordinates(contextBox.getAbsoluteContentBounds(), contextBox);
                imgx += contextBox.getBorder().left + contextBox.getPadding().left; //recompute to border box
                imgy += contextBox.getBorder().top + contextBox.getPadding().top;
                break;
            default: //PADDING_BOX
                computeCoordinates(contextBox.getAbsolutePaddingBounds(), contextBox);
                imgx += contextBox.getBorder().left; //recompute to border box
                imgy += contextBox.getBorder().top;
                break;
        }
    }
    
    protected void computeCoordinates(Rectangle bounds, ElementBox contextBox)
    {
        CSSDecoder dec = new CSSDecoder(contextBox.getVisualContext());
        computeSize(bounds, dec);
        
        //X position
        if (position == BackgroundPosition.LEFT)
            imgx = 0;
        else if (position == BackgroundPosition.RIGHT)
            imgx = bounds.width - imgw;
        else if (position == BackgroundPosition.CENTER)
            imgx = (bounds.width - imgw) / 2;
        else if (position == BackgroundPosition.list_values)
        {
            imgx = dec.getLength((TermLengthOrPercent) positionValues.get(0), false, 0, 0, bounds.width - imgw);
        }
        else
            imgx = 0;
        
        //Y position
        if (position == BackgroundPosition.TOP)
            imgy = 0;
        else if (position == BackgroundPosition.BOTTOM)
            imgy = bounds.height - imgh;
        else if (position == BackgroundPosition.CENTER)
            imgy = (bounds.height - imgh) / 2;
        else if (position == BackgroundPosition.list_values)
        {
            int i = positionValues.size() > 1 ? 1 : 0;
            imgy = dec.getLength((TermLengthOrPercent) positionValues.get(i), false, 0, 0, bounds.height - imgh);
        }
        else
            imgy = 0;
    }

    protected void computeSize(Rectangle bounds, CSSDecoder dec)
    {
        if (size == BackgroundSize.COVER)
        {
            if (hasIntrinsicRatio())
            {
                final float ir = getIntrinsicRatio();
                float w1 = bounds.width;
                float h1 = w1 / ir;
                float h2 = bounds.height;
                float w2 = h2 * ir;
                if (h1 - bounds.height > w2 - bounds.width)
                {
                    imgw = w1; imgh = h1;
                }
                else
                {
                    imgw = w2; imgh = h2;
                }
            }
            else
            {
                imgw = bounds.width;
                imgh = bounds.height;
            }
        }
        else if (size == BackgroundSize.CONTAIN)
        {
            if (hasIntrinsicRatio())
            {
                final float ir = getIntrinsicRatio();
                float w1 = bounds.width;
                float h1 = w1 / ir;
                float h2 = bounds.height;
                float w2 = h2 * ir;
                if (h1 - bounds.height < w2 - bounds.width)
                {
                    imgw = w1; imgh = h1;
                }
                else
                {
                    imgw = w2; imgh = h2;
                }
            }
            else
            {
                imgw = bounds.width;
                imgh = bounds.height;
            }
        }
        else if (size == BackgroundSize.list_values)
        {
            if (sizeValues == null) //no values provided: auto,auto is the default
            {
                imgw = getAutoWidth(bounds);
                imgh = getAutoHeight(bounds);
            }
            else if (sizeValues.size() == 2) //two values should be provided by jStyleParser
            {
                Term<?> w = sizeValues.get(0);
                Term<?> h = sizeValues.get(1);
                if (w instanceof TermLengthOrPercent && h instanceof TermLengthOrPercent)
                {
                    imgw = dec.getLength((TermLengthOrPercent) w, false, 0, 0, bounds.width);                    
                    imgh = dec.getLength((TermLengthOrPercent) h, false, 0, 0, bounds.height);                    
                }
                else if (w instanceof TermLengthOrPercent)
                {
                    imgw = dec.getLength((TermLengthOrPercent) w, false, 0, 0, bounds.width);
                    if (hasIntrinsicRatio())
                        imgh = Math.round(imgw / getIntrinsicRatio());
                    else
                        imgh = getAutoHeight(bounds);
                }
                else if (h instanceof TermLengthOrPercent)
                {
                    imgh = dec.getLength((TermLengthOrPercent) h, false, 0, 0, bounds.height);
                    if (hasIntrinsicRatio())
                        imgw = Math.round(imgh * getIntrinsicRatio());
                    else
                        imgw = getAutoWidth(bounds);
                }
                else
                {
                    imgw = getAutoWidth(bounds);
                    imgh = getAutoHeight(bounds);
                }
            }
            else //this should not happen
            {
                log.error("Invalid number BackgroundSize values: {}", sizeValues);
                imgw = getAutoWidth(bounds);
                imgh = getAutoHeight(bounds);
            }
        }
        
    }
    
}
