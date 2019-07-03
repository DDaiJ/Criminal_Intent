package com.example.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * CrimeLab holds a list of Crimes
 */
public class CrimeLab {
    private static CrimeLab sCrimeLab;

    private List<Crime> mCrimes;
    private Map<UUID, Integer> mCrimePositions;

    /**
     * Returns the CrimeLab which holds a list of Crimes (in replace of the constructor)
     *
     * @param context the Context of the environment that gets the returned data
     * @return a CrimeLab
     */
    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }

        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();
        mCrimePositions = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            Crime crime = new Crime();
            crime.setTitle("Crime #" + i);
            crime.setSolved(i % 2 == 0);
            mCrimes.add(crime);
            mCrimePositions.put(crime.getId(), i);
        }
    }

    /**
     * Return the list of Crimes stored in this
     *
     * @return a list of Crimes
     */
    public List<Crime> getCrimes() {
        return mCrimes;
    }

    /**
     * Return the information of a Crime
     *
     * @param id the UUID of the Crime to find
     * @return the Crime associated with the id if found, else return null
     */
    public Crime getCrime(UUID id) {
        for (Crime crime : mCrimes) {
            if (crime.getId().equals(id)) {
                return crime;
            }
        }
        return null;
    }

    /**
     * Return the position of the Crime with the given crimeId in the list of crimes
     *
     * @param id the crimeId of the Crime to find
     * @return the position of the Crime if found, else return null
     */
    public int getCrimePosition(UUID id) {
        return mCrimePositions.get(id);
    }
}
