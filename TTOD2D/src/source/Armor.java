package source;

/**
 * @author  Drake
 * @version 1.0
 * @since   1.0    16.12.2016
 */

public class Armor extends Item {

    /**
     * This variable is used to determine the defence value of the equipable
     * @see Item of type
     * @see Armor which is used to calculate damage in
     * @see Combat
     */
    private float defence = 0;

    /**
     * @return defence is returned when the method is called
     */
    public float getDefence() {
        return defence;
    }

    /**
     * @param defence is used to assign and set the returned value as the defence value of
     * @see Armor
     */
    public void setDefence(float defence) {
        this.defence = defence;
    }
}

/*
@author John Smith	Describes an author.	Class, Interface, Enum
@version version	Provides software version entry. Max one per Class or Interface.	Class, Interface, Enum
@since since-text	Describes when this functionality has first existed.	Class, Interface, Enum, Field, Method
@see reference	Provides a link to other element of documentation.	Class, Interface, Enum, Field, Method
@param name description	Describes a method parameter.	Method
@return description	Describes the return value.	Method
@exception classname description
@throws classname description	Describes an exception that may be thrown from this method.	Method
@deprecated description	Describes an outdated method.	Class, Interface, Enum, Field, Method
{@inheritDoc}	Copies the description from the overridden method.	Overriding Method	1.4.0
{@link reference}	Link to other symbol.	Class, Interface, Enum, Field, Method
{@value #STATIC_FIELD}	Return the value of a static field.	Static Field	1.4.0
{@code literal}	Formats literal text in the code font. It is equivalent to <code>{@literal}</code>.	Class, Interface, Enum, Field, Method	1.5.0
{@literal literal}	Denotes literal text. The enclosed text is interpreted as not containing HTML markup or nested javadoc tags.	Class, Interface, Enum, Field, Method	1.5.0
 */