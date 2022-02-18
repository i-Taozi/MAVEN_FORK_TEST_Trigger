package cz.vutbr.web.css;

import java.util.Collection;

import cz.vutbr.web.css.CSSProperty.ValueType;

/**
 * Wrap of CSS properties defined for element. Enumeration values follows this
 * syntax:
 * 
 * <ul style="list-style:none"> <li>
 * <b>UPPERCASE</b> terminal symbols, direct values present in stylesheet, such
 * as background-color: transparent;</li> <li>
 * <b>lowercase</b> non-terminal symbols, just information that concrete value
 * is stored somewhere else</li> </ul>
 * 
 * @author kapy
 * @author burgetr
 */
public interface NodeData {

	/**
	 * Returns property of given name and supposed type. Inherited properties
	 * are included.
	 * 
	 * @param <T>
	 *            Type of property returned. Let compiler infer returning type 
	 *            from left part of statement, otherwise return just CSSProperty
	 * @param name
	 *            Name of property
	 * @return Value of property of type T or <code>null</code>
	 */
	public <T extends CSSProperty> T getProperty(String name);

	/**
	 * Returns property of given name and supposed type. Inherited properties
	 * can be avoided
	 * 
	 * @param <T>
	 *            Type of property returned. Let compiler infer returning type 
	 *            from left part of statement, otherwise return just CSSProperty
	 * @param name
	 *            Name of property
	 * @param includeInherited
	 *            Whether to include inherited properties or not
	 * @return Value of property of type T or <code>null</code>
	 */
	public <T extends CSSProperty> T getProperty(String name, boolean includeInherited);
	
    /**
     * Returns n-th property of given name and supposed type. Inherited properties
     * are included. This is used for properties of the {@link ValueType#LIST} type
     * which can have multiple values.
     * 
     * @param <T>
     *            Type of property returned. Let compiler infer returning type 
     *            from left part of statement, otherwise return just CSSProperty
     * @param name
     *            Name of property
     * @param index
     *            Property value index
     * @return Value of property of type T or <code>null</code>
     */
    public <T extends CSSProperty> T getProperty(String name, int index);

    /**
     * Returns n-th property of given name and supposed type. Inherited properties
     * are included. This is used for properties of the {@link ValueType#LIST} type
     * which can have multiple values.
     * 
     * @param <T>
     *            Type of property returned. Let compiler infer returning type 
     *            from left part of statement, otherwise return just CSSProperty
     * @param name
     *            Name of property
     * @param index
     *            Property value index
     * @param includeInherited
     *            Whether to include inherited properties or not
     * @return Value of property of type T or <code>null</code>
     */
    public <T extends CSSProperty> T getProperty(String name, int index, boolean includeInherited);
    
	/**
	 * Returns the property of the given name after applying the defaulting processes.
	 * 
	 * @param name
	 *     Property name
	 * @return The specified value of the property of the type T or {@code null} if the
	 * value is not available and no default value is applicable.
	 */
	public <T extends CSSProperty> T getSpecifiedProperty(String name);

    /**
     * Returns the <em>cascaded value</em> of property of given name.
     * Inherited values can be avoided.
     * 
     * @param name
     *            Name of property
     * @param includeInherited
     *            Whether to include inherited properties or not
     * @return Value of property or <code>null</code>
     */
    public Term<?> getValue(String name, boolean includeInherited);
    
	/**
     * Returns the <em>cascaded value</em> of property of given name and supposed type.
     * Inherited values can be avoided.
	 * 
	 * @param <T>
	 *            Type of value returned
	 * @param clazz
	 *            Class of type
	 * @param name
	 *            Name of property
	 * @return Value of property of type T or <code>null</code>
	 */
	public <T extends Term<?>> T getValue(Class<T> clazz, String name);

	/**
	 * Returns the <em>cascaded value</em> of property of given name and supposed type.
	 * Inherited values can be avoided.
	 * 
	 * @param <T>
	 *            Type of value returned 
	 * @param clazz
	 *            Class of type
	 * @param name
	 *            Name of property
	 * @param includeInherited
	 *            Whether to include inherited properties or not
	 * @return Value of property of type T or <code>null</code>
	 */
	public <T extends Term<?>> T getValue(Class<T> clazz, String name,
			boolean includeInherited);

    /**
     * Returns the <em>cascaded value</em> of a list property of given name.
     * Inherited values can be avoided.
     * 
     * @param name
     *            Name of property
     * @param index
     *            Property value index
     * @param includeInherited
     *            Whether to include inherited properties or not
     * @return Value of property or <code>null</code>
     */
    public Term<?> getValue(String name, int index, boolean includeInherited);
    
    /**
     * Returns the <em>cascaded value</em> of a list property of given name and supposed type.
     * Inherited values can be avoided.
     * 
     * @param <T>
     *            Type of value returned
     * @param clazz
     *            Class of type
     * @param name
     *            Name of property
     * @param index
     *            Property value index
     * @return Value of property of type T or <code>null</code>
     */
    public <T extends Term<?>> T getValue(Class<T> clazz, String name, int index);

    /**
     * Returns the <em>cascaded value</em> of a list property of given name and supposed type.
     * Inherited values can be avoided.
     * 
     * @param <T>
     *            Type of value returned 
     * @param clazz
     *            Class of type
     * @param name
     *            Name of property
     * @param index
     *            Property value index
     * @param includeInherited
     *            Whether to include inherited properties or not
     * @return Value of property of type T or <code>null</code>
     */
    public <T extends Term<?>> T getValue(Class<T> clazz, String name, int index,
            boolean includeInherited);

	/**
	 * Returns the <em>specified value</em> of a property which corresponds to the
	 * cascaded value (obtained by {@link NodeData#getValue(String, boolean)}) with
	 * applying the defaulting processes.
	 * @param name the property name
	 * @return the property value or {@code null} when the property value is not defined
	 * and no default value is available.
	 */
	public Term<?> getSpecifiedValue(String name);
    
	/**
     * Returns the <em>specified value</em> of a property which corresponds to the
     * cascaded value (obtained by {@link NodeData#getValue(String, boolean)}) with
     * applying the defaulting processes.
     * 
	 * @param clazz the expected class of the result
	 * @param name the property name
     * @return the property value or {@code null} when the property value is not defined
     * and no default value is available.
	 */
	public <T extends Term<?>> T getSpecifiedValue(Class<T> clazz, String name);
	
	/**
	 * Returns a string representation of the property value.
	 * 
	 * @param name
	 *             Property name
	 * @param includeInherited
	 *             Whether to include inherited properties or not
	 * @return The string representation of the assigned property value
	 * or {@code null} when the property is not defined.
	 */
	public String getAsString(String name, boolean includeInherited);
	
    /**
     * For list properties, obtains the number of property values in the nested list.
     * 
     * @param name property name
     * @param includeInherited Whether to include inherited properties or not
     * @return the number of property values defined in the list
     */
    public int getListSize(String name, boolean includeInherited);
    
	/**
	 * Accepts values from parent as its own. <code>null</code> parent is
	 * allowed, than instance is returned unchanged.
	 * 
	 * @param parent
	 *            Source of inheritance
	 * @return Modified instance
	 * @throws ClassCastException When parent implementation class is not the same
	 */
	public NodeData inheritFrom(NodeData parent) throws ClassCastException;

	/**
	 * Replaces all {@code inherit}, {@code initial} and {@code unset} CSS properties 
	 * with the inherited values or default values of user agent.
	 * 
	 * @return Modified property
	 */
	public NodeData concretize();

	/**
	 * Adds data stored in declaration into current instance
	 * 
	 * @param d
	 *            Declaration to be added
	 * @return Modified instance
	 *            	 
	 */            
	public NodeData push(Declaration d);

	/**
	 * Returns the names of all the that are available in the current node.
	 *  
	 * @return the name of the properties.
	 */
	public Collection<String> getPropertyNames();
	
	/**
	 * Obtains the source declaration used for the given property. Inherited properties are included.
	 * @param name The property name.
	 * @return the source declaration
	 */
	public Declaration getSourceDeclaration(String name);
	
    /**
     * Obtains the source declaration used for the given property.
     * @param name The property name.
     * @param includeInherited whether to include the inherited properties.
     * @return the source declaration
     */
    public Declaration getSourceDeclaration(String name, boolean includeInherited);
    
}
