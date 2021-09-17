
package com.moringaschool.rentbook.modules;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.IdentityCollection;
import org.parceler.InjectionUtil;
import org.parceler.ParcelWrapper;
import org.parceler.ParcelerRuntimeException;

@Generated("org.parceler.ParcelAnnotationProcessor")
@SuppressWarnings({
    "unchecked",
    "deprecation"
})
public class Property$$Parcelable
    implements Parcelable, ParcelWrapper<com.moringaschool.rentbook.modules.Property>
{

    private com.moringaschool.rentbook.modules.Property property$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<Property$$Parcelable>CREATOR = new Creator<Property$$Parcelable>() {


        @Override
        public Property$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new Property$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public Property$$Parcelable[] newArray(int size) {
            return new Property$$Parcelable[size] ;
        }

    }
    ;

    public Property$$Parcelable(com.moringaschool.rentbook.modules.Property property$$2) {
        property$$0 = property$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(property$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.moringaschool.rentbook.modules.Property property$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(property$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(property$$1));
            parcel$$1 .writeInt((InjectionUtil.getField(boolean.class, com.moringaschool.rentbook.modules.Property.class, property$$1, "has_water")? 1 : 0));
            parcel$$1 .writeInt((InjectionUtil.getField(boolean.class, com.moringaschool.rentbook.modules.Property.class, property$$1, "has_internet")? 1 : 0));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.moringaschool.rentbook.modules.Property.class, property$$1, "caretaker_phone_number"));
            parcel$$1 .writeInt(InjectionUtil.getField(int.class, com.moringaschool.rentbook.modules.Property.class, property$$1, "landlord_id"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.moringaschool.rentbook.modules.Property.class, property$$1, "name"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.moringaschool.rentbook.modules.Property.class, property$$1, "location"));
            parcel$$1 .writeInt(InjectionUtil.getField(int.class, com.moringaschool.rentbook.modules.Property.class, property$$1, "id"));
            parcel$$1 .writeInt((InjectionUtil.getField(boolean.class, com.moringaschool.rentbook.modules.Property.class, property$$1, "has_electricity")? 1 : 0));
            parcel$$1 .writeInt(InjectionUtil.getField(int.class, com.moringaschool.rentbook.modules.Property.class, property$$1, "number_of_units"));
            parcel$$1 .writeLong(InjectionUtil.getField(long.class, com.moringaschool.rentbook.modules.Property.class, property$$1, "rent_per_unit"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.moringaschool.rentbook.modules.Property.class, property$$1, "caretaker_name"));
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.moringaschool.rentbook.modules.Property getParcel() {
        return property$$0;
    }

    public static com.moringaschool.rentbook.modules.Property read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.moringaschool.rentbook.modules.Property property$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            property$$4 = new com.moringaschool.rentbook.modules.Property();
            identityMap$$1 .put(reservation$$0, property$$4);
            InjectionUtil.setField(com.moringaschool.rentbook.modules.Property.class, property$$4, "has_water", (parcel$$3 .readInt() == 1));
            InjectionUtil.setField(com.moringaschool.rentbook.modules.Property.class, property$$4, "has_internet", (parcel$$3 .readInt() == 1));
            InjectionUtil.setField(com.moringaschool.rentbook.modules.Property.class, property$$4, "caretaker_phone_number", parcel$$3 .readString());
            InjectionUtil.setField(com.moringaschool.rentbook.modules.Property.class, property$$4, "landlord_id", parcel$$3 .readInt());
            InjectionUtil.setField(com.moringaschool.rentbook.modules.Property.class, property$$4, "name", parcel$$3 .readString());
            InjectionUtil.setField(com.moringaschool.rentbook.modules.Property.class, property$$4, "location", parcel$$3 .readString());
            InjectionUtil.setField(com.moringaschool.rentbook.modules.Property.class, property$$4, "id", parcel$$3 .readInt());
            InjectionUtil.setField(com.moringaschool.rentbook.modules.Property.class, property$$4, "has_electricity", (parcel$$3 .readInt() == 1));
            InjectionUtil.setField(com.moringaschool.rentbook.modules.Property.class, property$$4, "number_of_units", parcel$$3 .readInt());
            InjectionUtil.setField(com.moringaschool.rentbook.modules.Property.class, property$$4, "rent_per_unit", parcel$$3 .readLong());
            InjectionUtil.setField(com.moringaschool.rentbook.modules.Property.class, property$$4, "caretaker_name", parcel$$3 .readString());
            com.moringaschool.rentbook.modules.Property property$$3 = property$$4;
            identityMap$$1 .put(identity$$1, property$$3);
            return property$$3;
        }
    }

}
