/**
 * RuleFontFace.java
 *
 * Created on 1.2.2013, 14:27:04 by burgetr
 */
package cz.vutbr.web.css;

import java.util.List;

import cz.vutbr.web.css.CSSProperty.FontStyle;
import cz.vutbr.web.css.CSSProperty.FontWeight;

/**
 * Contains collection of CSS declarations specified for a given font.
 * 
 * @author burgetr
 */
public interface RuleFontFace extends RuleBlock<Declaration>, PrettyOutput
{
	/**
	 * Gets the font family name
	 * @return Font family name
	 */
    public String getFontFamily();
    
    /**
     * Gets the declared font sources
     * @return The list of sources or {@code null} when no valid source declaration is present.
     */
    public List<Source> getSources();
    
    /**
     * Gets the font style
     * @return Font style
     */
    public FontStyle getFontStyle();
    
    /**
     * Gets the font weight
     * @return Font weight
     */
    public FontWeight getFontWeight();
    
    /**
     * Gets the unicode ranges
     * @return List of unicode ranges
     */
    public List<String> getUnicodeRanges();
    
    //=================================================================================
    
    /**
     * A generic font source.
     * @author burgetr
     */
    public interface Source
    {
    }
    
    /**
     * A local font (src: local()). 
     * @author burgetr
     */
    public interface SourceLocal extends Source
    {
        /** The local font name */
        public String getName();
    }
    
    /**
     * A remote source indentified by its URL (src: url()). 
     * @author burgetr
     */
    public interface SourceURL extends Source
    {
        /** The font URI specification */
        public TermURI getURI();
        /** Format specification or {@code null} if not present */
        public String getFormat();
    }
    
}
